/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.mdsd.dns2016.drones.behaviour.text.validation;

import com.google.common.base.Objects;
import hu.bme.mit.mdsd.dns2016.behaviour.BehaviourPackage;
import hu.bme.mit.mdsd.dns2016.behaviour.Condition;
import hu.bme.mit.mdsd.dns2016.behaviour.DroneBehaviour;
import hu.bme.mit.mdsd.dns2016.behaviour.Instruct;
import hu.bme.mit.mdsd.dns2016.behaviour.Lift;
import hu.bme.mit.mdsd.dns2016.behaviour.Pause;
import hu.bme.mit.mdsd.dns2016.behaviour.PerformAction;
import hu.bme.mit.mdsd.dns2016.behaviour.WaitForMessage;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.Queries;
import hu.bme.mit.mdsd.dns2016.behaviour.queries.WellFormedBehaviourModelMatcher;
import hu.bme.mit.mdsd.dns2016.drones.Action;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.FieldObject;
import hu.bme.mit.mdsd.dns2016.drones.Mission;
import hu.bme.mit.mdsd.dns2016.drones.MovableObject;
import hu.bme.mit.mdsd.dns2016.drones.Parameter;
import hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.Import;
import hu.bme.mit.mdsd.dns2016.drones.behaviour.text.resource.ResourceHandler;
import hu.bme.mit.mdsd.dns2016.drones.behaviour.text.validation.AbstractBehavDslValidator;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class BehavDslValidator extends AbstractBehavDslValidator {
  @Check
  public void checkDroneBehaviourDronesListIsDistinct(final DroneBehaviour behav) {
    final EList<Drone> drones = behav.getDrones();
    final HashSet<Drone> uniqueDrones = new HashSet<Drone>();
    for (final Drone d : drones) {
      uniqueDrones.add(d);
    }
    int _size = drones.size();
    int _size_1 = uniqueDrones.size();
    boolean _notEquals = (_size != _size_1);
    if (_notEquals) {
      this.error("Multiple references to the same drone!", 
        BehaviourPackage.Literals.DRONE_BEHAVIOUR__DRONES, "DRONES_NOT_UNIQUE");
      return;
    }
  }
  
  @Check
  public void checkCanLiftMovableObject(final Lift lift) {
    EObject behav = lift.eContainer();
    final MovableObject object = lift.getTarget();
    while ((!(behav instanceof DroneBehaviour))) {
      EObject _eContainer = behav.eContainer();
      behav = _eContainer;
    }
    if ((behav instanceof DroneBehaviour)) {
      final EList<Drone> drones = ((DroneBehaviour)behav).getDrones();
      final HashSet<Drone> validDrones = new HashSet<Drone>();
      for (final Drone d : drones) {
        float _maxPayload = d.getMaxPayload();
        float _weight = object.getWeight();
        boolean _greaterEqualsThan = (_maxPayload >= _weight);
        if (_greaterEqualsThan) {
          validDrones.add(d);
        }
      }
      int _size = drones.size();
      int _size_1 = validDrones.size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        this.error("Object is too heavy for the related drone(s) to lift!", 
          BehaviourPackage.Literals.LIFT__TARGET, "INVALID_LIFT");
        return;
      }
    }
  }
  
  @Check
  public void checkActionReference(final PerformAction action) {
    EObject behav = action.eContainer();
    boolean wasInstruction = false;
    while ((!(behav instanceof DroneBehaviour))) {
      {
        if ((behav instanceof Instruct)) {
          wasInstruction = true;
        }
        EObject _eContainer = behav.eContainer();
        behav = _eContainer;
      }
    }
    if ((!wasInstruction)) {
      if ((behav instanceof DroneBehaviour)) {
        final EList<Drone> drones = ((DroneBehaviour)behav).getDrones();
        final HashSet<Drone> validDrones = new HashSet<Drone>();
        for (final Drone d : drones) {
          EList<Action> _supportedActions = d.getSupportedActions();
          Action _action = action.getAction();
          boolean _contains = _supportedActions.contains(_action);
          if (_contains) {
            validDrones.add(d);
          }
        }
        int _size = drones.size();
        int _size_1 = validDrones.size();
        boolean _notEquals = (_size != _size_1);
        if (_notEquals) {
          this.error("Invalid action reference!", 
            BehaviourPackage.Literals.PERFORM_ACTION__ACTION, "INVALID_ACTION_REFERENCE");
          return;
        }
      }
    }
  }
  
  @Check
  public void checkActionTargetParameter(final PerformAction action) {
    final FieldObject target = action.getTarget();
    Action _action = action.getAction();
    final String property = _action.getKey();
    EList<Parameter> _parameters = target.getParameters();
    final Function1<Parameter, Boolean> _function = (Parameter p) -> {
      String _key = p.getKey();
      return Boolean.valueOf(_key.equals(property));
    };
    Parameter _findFirst = IterableExtensions.<Parameter>findFirst(_parameters, _function);
    String _value = null;
    if (_findFirst!=null) {
      _value=_findFirst.getValue();
    }
    String value = _value;
    if ((value == null)) {
      EClass _eClass = target.eClass();
      EList<EAttribute> _eAllAttributes = _eClass.getEAllAttributes();
      final Function1<EAttribute, Boolean> _function_1 = (EAttribute eAttr) -> {
        String _name = eAttr.getName();
        return Boolean.valueOf(_name.equals(property));
      };
      EAttribute feature = IterableExtensions.<EAttribute>findFirst(_eAllAttributes, _function_1);
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        this.error("This action cannot be performed on this target!", 
          BehaviourPackage.Literals.PERFORM_ACTION__TARGET, "INVALID_ACTION_TARGET");
      }
    }
  }
  
  @Check
  public void checkInvalidDuration(final Pause pause) {
    final float dur = pause.getDuration();
    if ((dur < 0.5)) {
      this.warning("Extremely low durations might not have any substantial effect!", 
        BehaviourPackage.Literals.PAUSE__DURATION, "INVALID_NUMBER");
      return;
    }
  }
  
  @Check
  public void checkInvalidTimeout(final WaitForMessage wfm) {
    final float timeout = wfm.getTimeout();
    if ((timeout < 0.5)) {
      this.warning("Extremely low durations might not have any substantial effect!", 
        BehaviourPackage.Literals.WAIT_FOR_MESSAGE__TIMEOUT, "INVALID_NUMBER");
      return;
    }
  }
  
  @Check
  public void checkIncQueryWellFormed(final DroneBehaviour behav) {
    try {
      EMFScope _eMFScope = new EMFScope(behav);
      final IncQueryEngine engine = IncQueryEngine.on(_eMFScope);
      Queries _instance = Queries.instance();
      _instance.prepare(engine);
      WellFormedBehaviourModelMatcher.on(engine);
      Set<? extends IncQueryMatcher<? extends IPatternMatch>> _currentMatchers = engine.getCurrentMatchers();
      final IncQueryMatcher<? extends IPatternMatch> matcher = ((IncQueryMatcher<? extends IPatternMatch>[])Conversions.unwrapArray(_currentMatchers, IncQueryMatcher.class))[0];
      int _countMatches = matcher.countMatches();
      boolean _equals = (_countMatches == 0);
      if (_equals) {
        this.warning("Model is not well formed (check IncQuery validations)!", 
          BehaviourPackage.Literals.DRONE_BEHAVIOUR__DRONES, "BEHAV_NOT_WELLFORMED");
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Check
  public void checkValidCondition(final Condition condition) {
    final FieldObject target = condition.getFieldObject();
    final String property = condition.getKey();
    EList<Parameter> _parameters = target.getParameters();
    final Function1<Parameter, Boolean> _function = (Parameter p) -> {
      String _key = p.getKey();
      return Boolean.valueOf(_key.equals(property));
    };
    Parameter _findFirst = IterableExtensions.<Parameter>findFirst(_parameters, _function);
    String _value = null;
    if (_findFirst!=null) {
      _value=_findFirst.getValue();
    }
    String value = _value;
    if ((value == null)) {
      EClass _eClass = target.eClass();
      EList<EAttribute> _eAllAttributes = _eClass.getEAllAttributes();
      final Function1<EAttribute, Boolean> _function_1 = (EAttribute eAttr) -> {
        String _name = eAttr.getName();
        return Boolean.valueOf(_name.equals(property));
      };
      EAttribute feature = IterableExtensions.<EAttribute>findFirst(_eAllAttributes, _function_1);
      boolean _equals = Objects.equal(feature, null);
      if (_equals) {
        this.error("Invalid condition!", 
          BehaviourPackage.Literals.CONDITION__KEY, "INVALID_CONDITION");
      }
    }
  }
  
  @Check
  public void checkValidImport(final Import imp) {
    try {
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      String _importName = imp.getImportName();
      final URI path = URI.createURI(_importName);
      final Resource resource = resourceSet.getResource(path, true);
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      final Mission mission = ((Mission) _get);
      ResourceHandler _instance = ResourceHandler.getInstance();
      Mission _mission = _instance.getMission();
      boolean _notEquals = (!Objects.equal(_mission, mission));
      if (_notEquals) {
        ResourceHandler _instance_1 = ResourceHandler.getInstance();
        _instance_1.loadMission(mission);
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        ResourceHandler _instance_2 = ResourceHandler.getInstance();
        _instance_2.loadMission(null);
        EObject _eContainer = imp.eContainer();
        EStructuralFeature _eContainingFeature = imp.eContainingFeature();
        this.error("Couldn\'t resolve import", _eContainer, _eContainingFeature, "INVALID_IMPORT");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}