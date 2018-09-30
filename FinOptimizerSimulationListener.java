package net.sf.openrocket.FinOptimizer;

import net.sf.openrocket.document.Simulation;

import net.sf.openrocket.gui.simulation.SimulationPlotPanel;

import net.sf.openrocket.simulation.SimulationStatus;
import net.sf.openrocket.simulation.exception.SimulationException;
import net.sf.openrocket.simulation.listeners.AbstractSimulationListener;
import net.sf.openrocket.simulation.FlightDataBranch;
import net.sf.openrocket.simulation.FlightDataType;
import net.sf.openrocket.simulation.FlightEvent;

import net.sf.openrocket.unit.Unit;
import net.sf.openrocket.unit.UnitGroup;

import net.sf.openrocket.util.LinearInterpolator;


public class FinOptimizerSimulationListener extends AbstractSimulationListener {

  private double[] ranges;
  private double step;

  public FinOptimizerSimulationListener(double[] ranges){
    super();
    this.ranges = ranges;
  }

  @Override
  public int[] Optimizer(Simulation simulation, SimulationStatus status, double[] initial_params) throws SimulationException {
    double[] final_params = initial_params;
    for(int i = 0; i <11;i++){

    }
  }
  @params
  public test_Range(int r){

  }

}
