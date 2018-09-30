package net.sf.openrocket.FinOptimizer

import net.sf.openrocket.plug.Plugin;
import net.sf.openrocket.simulation.extension.AbstractSimulationExtensionProvider;

//Simulation extension provider(Defines the extension and where it is displayed in the menu)

@Plugin
public class FinOptimizerProvider extends AbstractSimulationExtensionProvider {


  public FinOptimizerProvider(){
    super(FinOptimizer.class, "Flight", "Fin");
  }
}
