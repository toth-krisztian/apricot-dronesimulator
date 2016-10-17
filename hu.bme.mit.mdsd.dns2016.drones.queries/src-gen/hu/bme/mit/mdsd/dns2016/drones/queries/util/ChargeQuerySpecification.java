package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.dns2016.drones.queries.ChargeMatch;
import hu.bme.mit.mdsd.dns2016.drones.queries.ChargeMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate ChargeMatcher in a type-safe way.
 * 
 * @see ChargeMatcher
 * @see ChargeMatch
 * 
 */
@SuppressWarnings("all")
public final class ChargeQuerySpecification extends BaseGeneratedEMFQuerySpecification<ChargeMatcher> {
  private ChargeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ChargeQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ChargeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ChargeMatcher.on(engine);
  }
  
  @Override
  public ChargeMatch newEmptyMatch() {
    return ChargeMatch.newEmptyMatch();
  }
  
  @Override
  public ChargeMatch newMatch(final Object... parameters) {
    return ChargeMatch.newMatch((hu.bme.mit.mdsd.dns2016.drones.Battery) parameters[0], (java.lang.Float) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ChargeQuerySpecification INSTANCE = make();
    
    public static ChargeQuerySpecification make() {
      return new ChargeQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ChargeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.mdsd.dns2016.drones.queries.charge";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("b","C");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("b", "hu.bme.mit.mdsd.dns2016.drones.Battery"),new PParameter("C", "java.lang.Float"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_b = body.getOrCreateVariableByName("b");
      		PVariable var_C = body.getOrCreateVariableByName("C");
      		PVariable var_lifeTime = body.getOrCreateVariableByName("lifeTime");
      		PVariable var_remLifeTime = body.getOrCreateVariableByName("remLifeTime");
      		new TypeConstraint(body, new FlatTuple(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Battery")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_b, "b"),
      		   new ExportedParameter(body, var_C, "C")
      		));
      		//  	Battery.lifeTime(b, lifeTime)
      		new TypeConstraint(body, new FlatTuple(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Battery")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_b, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "Battery", "lifeTime")));
      		new Equality(body, var__virtual_0_, var_lifeTime);
      		//  	Battery.remainingLifeTime(b, remLifeTime)
      		new TypeConstraint(body, new FlatTuple(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("hu.bme.mit.mdsd.dns2016.drones", "Battery")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_b, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("hu.bme.mit.mdsd.dns2016.drones", "Battery", "remainingLifeTime")));
      		new Equality(body, var__virtual_1_, var_remLifeTime);
      		//  	 	C == eval(remLifeTime / lifeTime * 100)
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern charge";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("lifeTime", "remLifeTime");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float lifeTime = (java.lang.Float) provider.getValue("lifeTime");
      		                                    java.lang.Float remLifeTime = (java.lang.Float) provider.getValue("remLifeTime");
      		                                    return evaluateExpression_1_1(lifeTime, remLifeTime);
      		                                }
      		
      		                        },  var__virtual_2_ ); new Equality(body, var_C, var__virtual_2_);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("QueryBasedFeature");
      		addAnnotation(annotation);
      	}
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
  
  private static float evaluateExpression_1_1(final Float lifeTime, final Float remLifeTime) {
    return (((remLifeTime).floatValue() / (lifeTime).floatValue()) * 100);
  }
}
