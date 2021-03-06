/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.mdsd.dns2016.drones.behaviour.text.ui;

import com.google.inject.Injector;
import hu.bme.mit.mdsd.dns2016.drones.behaviour.text.ui.internal.TextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BehavDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TextActivator.getInstance().getInjector(TextActivator.HU_BME_MIT_MDSD_DNS2016_DRONES_BEHAVIOUR_TEXT_BEHAVDSL);
	}
	
}
