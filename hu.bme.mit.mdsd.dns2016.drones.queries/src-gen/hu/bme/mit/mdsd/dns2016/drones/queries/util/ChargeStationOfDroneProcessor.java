package hu.bme.mit.mdsd.dns2016.drones.queries.util;

import hu.bme.mit.mdsd.dns2016.drones.ChargeStation;
import hu.bme.mit.mdsd.dns2016.drones.Drone;
import hu.bme.mit.mdsd.dns2016.drones.queries.ChargeStationOfDroneMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.dns2016.drones.queries.chargeStationOfDrone pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ChargeStationOfDroneProcessor implements IMatchProcessor<ChargeStationOfDroneMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pD the value of pattern parameter d in the currently processed match
   * @param pCs the value of pattern parameter cs in the currently processed match
   * 
   */
  public abstract void process(final Drone pD, final ChargeStation pCs);
  
  @Override
  public void process(final ChargeStationOfDroneMatch match) {
    process(match.getD(), match.getCs());
  }
}
