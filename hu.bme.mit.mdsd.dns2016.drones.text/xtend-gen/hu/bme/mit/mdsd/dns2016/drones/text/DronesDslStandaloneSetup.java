/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.mdsd.dns2016.drones.text;

import hu.bme.mit.mdsd.dns2016.drones.text.DronesDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DronesDslStandaloneSetup extends DronesDslStandaloneSetupGenerated {
  public static void doSetup() {
    DronesDslStandaloneSetup _dronesDslStandaloneSetup = new DronesDslStandaloneSetup();
    _dronesDslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}