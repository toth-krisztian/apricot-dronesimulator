/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.mdsd.dns2016.drones.behaviour.text.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractBehavDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(hu.bme.mit.mdsd.dns2016.drones.behaviour.text.behavdslmodel.BehavdslmodelPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("hu.bme.mit.mdsd.dns2016.drones.behaviour"));
		return result;
	}
	
}
