/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.mdsd.dns2016.drones.behaviour.text;

import hu.bme.mit.mdsd.dns2016.drones.behaviour.text.BehavDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BehavDslStandaloneSetup extends BehavDslStandaloneSetupGenerated {
  public static void doSetup() {
    BehavDslStandaloneSetup _behavDslStandaloneSetup = new BehavDslStandaloneSetup();
    _behavDslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}