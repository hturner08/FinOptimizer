package net.sf.openrocket.FinOptimizer;

import net.sf.openrocket.simulation.SimulationStatus;
import net.sf.openrocket.simulation.exception.SimulationException;
import net.sf.openrocket.simulation.listeners.AbstractSimulationListener;

public class FinOptimizerSimulationListener extends AbstractSimulationListener {

  private double[] ranges;
  private double step;

  public FinOptimizerSimulationListener(double[] ranges){
    super();
    this.ranges = ranges;
  }

  @Override
  public int[] Optimizer(SimulationStatus status, double[] initial_params) throws SimulationException {
    double[] final_params = initial_params;
    for(int i = 0; i <11;i++){

    }
  }
  @params
  public test_Range(int r){

  }

}
