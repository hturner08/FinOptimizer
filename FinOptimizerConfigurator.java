package net.sf.openrocket.FinOptimizer;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import net.sf.openrocket.document.Simulation;
import net.sf.openrocket.gui.SpinnerEditor;
import net.sf.openrocket.gui.adaptors.DoubleModel;
import net.sf.openrocket.gui.components.BasicSlider;
import net.sf.openrocket.gui.components.UnitSelector;
import net.sf.openrocket.plugin.Plugin;
import net.sf.openrocket.simulation.extension.AbstractSwingSimulationExtensionConfigurator;
import net.sf.openrocket.unit.UnitGroup;

"""
Fin features:
-Number of fins
-Fin rotation
-Fin cant
-Root chord
-Tip chord
-Height
-Sweep length
-Sweep angle
-Position rleative to
-Cross section
-Thickness
11 features
"""

@Plugin
public class FinOptimizerConfigurator extends AbstractSwingSimulationExtensionConfigurator<FinOptimizer> {
  public FinOptimizerConfigurator(){
    super(FinOptimizer.class);
  }
  @Override
  protected JComponent getConfigurationComponent(FinOptimizer extension Simulation simulation, JPanel panel){
    panel.add(new JLabel("Fin Optimizer V0.1"));
    features = ["Number of fins, Fin rotation, Fin cant, Root chord, Tip chord, Height, Sweep length, Sweep angle, Position rleative to, Cross section, Thickness"]
    for (String feature:features){
      DoubleModel m = new DoubleModel(extension, feature, UnitGroup.UNITS_RELATIVE, 0);
  		JSpinner spin = new JSpinner(m.getSpinnerModel());
  		spin.setEditor(new SpinnerEditor(spin));
  		panel.add(spin, "w 65lp!");
  		UnitSelector unit = new UnitSelector(m);
  		panel.add(unit, "w 25");
  		BasicSlider slider = new BasicSlider(m.getSliderModel(3, 5));
  		panel.add(slider, "w 75lp, wrap");
    }
		return panel;


  }
}
