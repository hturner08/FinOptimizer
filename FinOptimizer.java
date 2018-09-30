package net.sf.openrocket.example;

import net.sf.openrocket.simulation.SimulationConditions;
import net.sf.openrocket.simulation.exception.SimulationException;
import net.sf.openrocket.simulation.extension.AbstractSimulationExtension;

public class FinOptimizer extends AbstractSimulationExtension{

  //Simulation Extension

  @Override
  public String getName(){
    return "Fin Optimizer"
  }
  @Override
  public String getDescription(){
    return "Run this extension to find optimal fin features according to OpenRocket"
  }

  @Override
  public void initiliaze(SimulationConditions conditions) throw SimulateException{
    conditions.getSimulationListenerList().add(new FinOptimizerSimulationListener(getMultiplier()));
  }

}
