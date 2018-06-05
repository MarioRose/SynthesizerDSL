/**
 * generated by Xtext 2.12.0
 */
package org.xtext.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.synthesizer.Button;
import org.xtext.synthesizer.ImpulseOscillator;
import org.xtext.synthesizer.PulseOscillator;
import org.xtext.synthesizer.RotaryKnob;
import org.xtext.synthesizer.SawToothOscillator;
import org.xtext.synthesizer.SineOscillator;
import org.xtext.synthesizer.Slider;
import org.xtext.synthesizer.SquareOscillator;
import org.xtext.synthesizer.TriangleOscillator;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SynthesizerGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Function1<SineOscillator, String> _function = (SineOscillator it) -> {
      String _name = it.getName();
      String _plus = ("private static UnitOscillator osc" + _name);
      return (_plus + ";\t       \n\t\t\t\t");
    };
    String _join = IteratorExtensions.join(IteratorExtensions.<SineOscillator, String>map(Iterators.<SineOscillator>filter(resource.getAllContents(), SineOscillator.class), _function), "\n\t\t\t\t");
    String _plus = ("\n\t\timport java.io.BufferedReader;\n\t\timport java.io.IOException;\n\t\timport java.io.InputStreamReader;\n\t\timport java.util.Scanner; \n\t\timport java.awt.event.ActionEvent;\n\t\timport java.awt.event.ActionListener;\n\t\timport java.awt.BorderLayout;\n\t\timport java.awt.GridLayout;\n\t\timport java.awt.Dimension;\n\n\t\timport javax.swing.*;  \n\t\timport javax.swing.JApplet;\n\t\timport com.jsyn.swing.JAppletFrame;\n\t\timport com.jsyn.swing.DoubleBoundedRangeSlider;\n\t\timport com.jsyn.swing.PortControllerFactory;\n\n\t\timport com.jsyn.swing.ExponentialRangeModel;\n\t\timport com.jsyn.swing.PortModelFactory;\n\t\timport com.jsyn.swing.RotaryTextController;\n\n\t\timport com.jsyn.JSyn;\n\t\timport com.jsyn.Synthesizer;\n\t\timport com.jsyn.unitgen.LineOut;\n\t\timport com.jsyn.unitgen.SineOscillator;\n\t\timport com.jsyn.unitgen.UnitOscillator;\n\t\timport com.jsyn.unitgen.LinearRamp;\n\t\timport com.jsyn.unitgen.SawtoothOscillatorBL;\n\t\timport com.jsyn.unitgen.SawtoothOscillator;\n\t\timport com.jsyn.unitgen.TriangleOscillator;\n\t\timport com.jsyn.unitgen.SquareOscillator;\n\t\timport com.jsyn.unitgen.PulseOscillator;\n\t\timport com.jsyn.unitgen.ImpulseOscillator;\n\n\n\t\tpublic class SynthesizerDSL extends JApplet{\n\t\t    static Synthesizer synth;\n            static LineOut lineOut;\n\n\t\t\t//SOUNDS\n\t\t\t" + _join);
    String _plus_1 = (_plus + "\n\n\t\t\t");
    final Function1<SawToothOscillator, String> _function_1 = (SawToothOscillator it) -> {
      String _name = it.getName();
      String _plus_2 = ("private static UnitOscillator osc" + _name);
      return (_plus_2 + ";\t       \n\t\t\t\t");
    };
    String _join_1 = IteratorExtensions.join(IteratorExtensions.<SawToothOscillator, String>map(Iterators.<SawToothOscillator>filter(resource.getAllContents(), SawToothOscillator.class), _function_1), "\n\t\t\t\t");
    String _plus_2 = (_plus_1 + _join_1);
    String _plus_3 = (_plus_2 + "\n\n\t\t\t");
    final Function1<TriangleOscillator, String> _function_2 = (TriangleOscillator it) -> {
      String _name = it.getName();
      String _plus_4 = ("private static UnitOscillator osc" + _name);
      return (_plus_4 + ";\t       \n\t\t\t\t");
    };
    String _join_2 = IteratorExtensions.join(IteratorExtensions.<TriangleOscillator, String>map(Iterators.<TriangleOscillator>filter(resource.getAllContents(), TriangleOscillator.class), _function_2), "\n\t\t\t\t");
    String _plus_4 = (_plus_3 + _join_2);
    String _plus_5 = (_plus_4 + "\n\n\t\t\t");
    final Function1<SquareOscillator, String> _function_3 = (SquareOscillator it) -> {
      String _name = it.getName();
      String _plus_6 = ("private static UnitOscillator osc" + _name);
      return (_plus_6 + ";\t       \n\t\t\t\t");
    };
    String _join_3 = IteratorExtensions.join(IteratorExtensions.<SquareOscillator, String>map(Iterators.<SquareOscillator>filter(resource.getAllContents(), SquareOscillator.class), _function_3), "\n\t\t\t\t");
    String _plus_6 = (_plus_5 + _join_3);
    String _plus_7 = (_plus_6 + "\n\n\t\t\t");
    final Function1<PulseOscillator, String> _function_4 = (PulseOscillator it) -> {
      String _name = it.getName();
      String _plus_8 = ("private static UnitOscillator osc" + _name);
      return (_plus_8 + ";\t       \n\t\t\t\t");
    };
    String _join_4 = IteratorExtensions.join(IteratorExtensions.<PulseOscillator, String>map(Iterators.<PulseOscillator>filter(resource.getAllContents(), PulseOscillator.class), _function_4), "\n\t\t\t\t");
    String _plus_8 = (_plus_7 + _join_4);
    String _plus_9 = (_plus_8 + "\n\n\t\t\t");
    final Function1<ImpulseOscillator, String> _function_5 = (ImpulseOscillator it) -> {
      String _name = it.getName();
      String _plus_10 = ("private static UnitOscillator osc" + _name);
      return (_plus_10 + ";\t       \n\t\t\t\t");
    };
    String _join_5 = IteratorExtensions.join(IteratorExtensions.<ImpulseOscillator, String>map(Iterators.<ImpulseOscillator>filter(resource.getAllContents(), ImpulseOscillator.class), _function_5), "\n\t\t\t\t");
    String _plus_10 = (_plus_9 + _join_5);
    String _plus_11 = (_plus_10 + "\n\n\n\t\t\t");
    String _generateUI = this.generateUI(resource);
    String _plus_12 = (_plus_11 + _generateUI);
    String _plus_13 = (_plus_12 + "\n\n\t\t    @Override\n\t\t    public void start() {\n\t        \t// Create a context for the synthesizer.\n\t            synth = JSyn.createSynthesizer();\n\t            // Start synthesizer using default stereo output at 44100 Hz.\n\t            synth.start();\n\t            // Add a stereo audio output unit.\n\t            synth.add(lineOut = new LineOut());\n\t            // We only need to start the LineOut. It will pull data from the\n\t            // oscillator.\n\t            lineOut.start();\n\n\t\t\t\t");
    final Function1<SineOscillator, String> _function_6 = (SineOscillator it) -> {
      String _name = it.getName();
      String _plus_14 = ("createSound" + _name);
      return (_plus_14 + "();\t       \n\t\t\t\t");
    };
    String _join_6 = IteratorExtensions.join(IteratorExtensions.<SineOscillator, String>map(Iterators.<SineOscillator>filter(resource.getAllContents(), SineOscillator.class), _function_6), "\n\t\t\t\t");
    String _plus_14 = (_plus_13 + _join_6);
    String _plus_15 = (_plus_14 + "\n\n\t\t\t\t");
    final Function1<SawToothOscillator, String> _function_7 = (SawToothOscillator it) -> {
      String _name = it.getName();
      String _plus_16 = ("createSound" + _name);
      return (_plus_16 + "();\t       \n\t\t\t\t");
    };
    String _join_7 = IteratorExtensions.join(IteratorExtensions.<SawToothOscillator, String>map(Iterators.<SawToothOscillator>filter(resource.getAllContents(), SawToothOscillator.class), _function_7), "\n\t\t\t\t");
    String _plus_16 = (_plus_15 + _join_7);
    String _plus_17 = (_plus_16 + "\n\n\t\t\t\t");
    final Function1<TriangleOscillator, String> _function_8 = (TriangleOscillator it) -> {
      String _name = it.getName();
      String _plus_18 = ("createSound" + _name);
      return (_plus_18 + "();\t       \n\t\t\t\t");
    };
    String _join_8 = IteratorExtensions.join(IteratorExtensions.<TriangleOscillator, String>map(Iterators.<TriangleOscillator>filter(resource.getAllContents(), TriangleOscillator.class), _function_8), "\n\t\t\t\t");
    String _plus_18 = (_plus_17 + _join_8);
    String _plus_19 = (_plus_18 + "\n\n\t\t\t\t");
    final Function1<SquareOscillator, String> _function_9 = (SquareOscillator it) -> {
      String _name = it.getName();
      String _plus_20 = ("createSound" + _name);
      return (_plus_20 + "();\t       \n\t\t\t\t");
    };
    String _join_9 = IteratorExtensions.join(IteratorExtensions.<SquareOscillator, String>map(Iterators.<SquareOscillator>filter(resource.getAllContents(), SquareOscillator.class), _function_9), "\n\t\t\t\t");
    String _plus_20 = (_plus_19 + _join_9);
    String _plus_21 = (_plus_20 + "\n\n\t\t\t\t");
    final Function1<PulseOscillator, String> _function_10 = (PulseOscillator it) -> {
      String _name = it.getName();
      String _plus_22 = ("createSound" + _name);
      return (_plus_22 + "();\t       \n\t\t\t\t");
    };
    String _join_10 = IteratorExtensions.join(IteratorExtensions.<PulseOscillator, String>map(Iterators.<PulseOscillator>filter(resource.getAllContents(), PulseOscillator.class), _function_10), "\n\t\t\t\t");
    String _plus_22 = (_plus_21 + _join_10);
    String _plus_23 = (_plus_22 + "\n\n\t\t\t\t");
    final Function1<ImpulseOscillator, String> _function_11 = (ImpulseOscillator it) -> {
      String _name = it.getName();
      String _plus_24 = ("createSound" + _name);
      return (_plus_24 + "();\t       \n\t\t\t\t");
    };
    String _join_11 = IteratorExtensions.join(IteratorExtensions.<ImpulseOscillator, String>map(Iterators.<ImpulseOscillator>filter(resource.getAllContents(), ImpulseOscillator.class), _function_11), "\n\t\t\t\t");
    String _plus_24 = (_plus_23 + _join_11);
    String _plus_25 = (_plus_24 + "\n\n\t\t    \tcreateAndShowGUI();\n\t\t\t}\n\t\t\t\n\n\t\t\t//---- Create Sounds ----\n\t\t\t//SineOscillators\n\t\t\t");
    final Function1<SineOscillator, String> _function_12 = (SineOscillator it) -> {
      String _name = it.getName();
      String _plus_26 = ("private static void createSound" + _name);
      String _plus_27 = (_plus_26 + "() {\n\t\t\t\t");
      String _plus_28 = (_plus_27 + 
        "\tosc");
      String _name_1 = it.getName();
      String _plus_29 = (_plus_28 + _name_1);
      String _plus_30 = (_plus_29 + " = new SineOscillator();\n\t\t\t\t\t// Add a tone generator.\n\t\t            synth.add(osc");
      String _name_2 = it.getName();
      String _plus_31 = (_plus_30 + _name_2);
      String _plus_32 = (_plus_31 + " );\n\t\t\t\t\n\t\t            // Set the frequency and amplitude for the sine wave.\n\t\t            osc");
      String _name_3 = it.getName();
      String _plus_33 = (_plus_32 + _name_3);
      String _plus_34 = (_plus_33 + ".frequency.set(");
      int _frequency = it.getFrequency();
      String _plus_35 = (_plus_34 + Integer.valueOf(_frequency));
      String _plus_36 = (_plus_35 + ");\n\t\t            osc");
      String _name_4 = it.getName();
      String _plus_37 = (_plus_36 + _name_4);
      String _plus_38 = (_plus_37 + ".amplitude.set(");
      int _amplitude = it.getAmplitude();
      String _plus_39 = (_plus_38 + Integer.valueOf(_amplitude));
      String _plus_40 = (_plus_39 + ");\n\t\t\t\t}\n\t\t\t\n\t\t\t\tprivate static void playSound");
      String _name_5 = it.getName();
      String _plus_41 = (_plus_40 + _name_5);
      String _plus_42 = (_plus_41 + "(){\n\t\t\t\t\tif(!osc");
      String _name_6 = it.getName();
      String _plus_43 = (_plus_42 + _name_6);
      String _plus_44 = (_plus_43 + ".output.isConnected()) {\n\t\t\t            osc");
      String _name_7 = it.getName();
      String _plus_45 = (_plus_44 + _name_7);
      String _plus_46 = (_plus_45 + ".output.connect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_8 = it.getName();
      String _plus_47 = (_plus_46 + _name_8);
      String _plus_48 = (_plus_47 + ".output.connect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t            osc");
      String _name_9 = it.getName();
      String _plus_49 = (_plus_48 + _name_9);
      String _plus_50 = (_plus_49 + ".output.disconnect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_10 = it.getName();
      String _plus_51 = (_plus_50 + _name_10);
      return (_plus_51 + ".output.disconnect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t}\n\t        ");
    };
    String _join_12 = IteratorExtensions.join(IteratorExtensions.<SineOscillator, String>map(Iterators.<SineOscillator>filter(resource.getAllContents(), SineOscillator.class), _function_12), "\n\t\t\t\t");
    String _plus_26 = (_plus_25 + _join_12);
    String _plus_27 = (_plus_26 + "\n\n\t\t\t//SawtoothOscillator\n\t\t\t");
    final Function1<SawToothOscillator, String> _function_13 = (SawToothOscillator it) -> {
      String _name = it.getName();
      String _plus_28 = ("private static void createSound" + _name);
      String _plus_29 = (_plus_28 + "() {\n\t\t\t\t");
      String _plus_30 = (_plus_29 + 
        "\tosc");
      String _name_1 = it.getName();
      String _plus_31 = (_plus_30 + _name_1);
      String _plus_32 = (_plus_31 + " = new SawtoothOscillator();\n\t\t\t\t\t// Add a tone generator.\n\t\t            synth.add(osc");
      String _name_2 = it.getName();
      String _plus_33 = (_plus_32 + _name_2);
      String _plus_34 = (_plus_33 + " );\n\t\t\t\t\n\t\t            // Set the frequency and amplitude for the sine wave.\n\t\t            osc");
      String _name_3 = it.getName();
      String _plus_35 = (_plus_34 + _name_3);
      String _plus_36 = (_plus_35 + ".frequency.set(");
      int _frequency = it.getFrequency();
      String _plus_37 = (_plus_36 + Integer.valueOf(_frequency));
      String _plus_38 = (_plus_37 + ");\n\t\t            osc");
      String _name_4 = it.getName();
      String _plus_39 = (_plus_38 + _name_4);
      String _plus_40 = (_plus_39 + ".amplitude.set(");
      int _amplitude = it.getAmplitude();
      String _plus_41 = (_plus_40 + Integer.valueOf(_amplitude));
      String _plus_42 = (_plus_41 + ");\n\t\t\t\t}\n\t\t\t\n\t\t\t\tprivate static void playSound");
      String _name_5 = it.getName();
      String _plus_43 = (_plus_42 + _name_5);
      String _plus_44 = (_plus_43 + "(){\n\t\t\t\t\tif(!osc");
      String _name_6 = it.getName();
      String _plus_45 = (_plus_44 + _name_6);
      String _plus_46 = (_plus_45 + ".output.isConnected()) {\n\t\t\t            osc");
      String _name_7 = it.getName();
      String _plus_47 = (_plus_46 + _name_7);
      String _plus_48 = (_plus_47 + ".output.connect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_8 = it.getName();
      String _plus_49 = (_plus_48 + _name_8);
      String _plus_50 = (_plus_49 + ".output.connect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t            osc");
      String _name_9 = it.getName();
      String _plus_51 = (_plus_50 + _name_9);
      String _plus_52 = (_plus_51 + ".output.disconnect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_10 = it.getName();
      String _plus_53 = (_plus_52 + _name_10);
      return (_plus_53 + ".output.disconnect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t}\n\t        ");
    };
    String _join_13 = IteratorExtensions.join(IteratorExtensions.<SawToothOscillator, String>map(Iterators.<SawToothOscillator>filter(resource.getAllContents(), SawToothOscillator.class), _function_13), "\n\t\t\t\t");
    String _plus_28 = (_plus_27 + _join_13);
    String _plus_29 = (_plus_28 + "\n\n\t\t\t//TriangleOscillator\n\t\t\t");
    final Function1<TriangleOscillator, String> _function_14 = (TriangleOscillator it) -> {
      String _name = it.getName();
      String _plus_30 = ("private static void createSound" + _name);
      String _plus_31 = (_plus_30 + "() {\n\t\t\t\t");
      String _plus_32 = (_plus_31 + 
        "\tosc");
      String _name_1 = it.getName();
      String _plus_33 = (_plus_32 + _name_1);
      String _plus_34 = (_plus_33 + " = new TriangleOscillator();\n\t\t\t\t\t// Add a tone generator.\n\t\t            synth.add(osc");
      String _name_2 = it.getName();
      String _plus_35 = (_plus_34 + _name_2);
      String _plus_36 = (_plus_35 + " );\n\t\t\t\t\n\t\t            // Set the frequency and amplitude for the sine wave.\n\t\t            osc");
      String _name_3 = it.getName();
      String _plus_37 = (_plus_36 + _name_3);
      String _plus_38 = (_plus_37 + ".frequency.set(");
      int _frequency = it.getFrequency();
      String _plus_39 = (_plus_38 + Integer.valueOf(_frequency));
      String _plus_40 = (_plus_39 + ");\n\t\t            osc");
      String _name_4 = it.getName();
      String _plus_41 = (_plus_40 + _name_4);
      String _plus_42 = (_plus_41 + ".amplitude.set(");
      int _amplitude = it.getAmplitude();
      String _plus_43 = (_plus_42 + Integer.valueOf(_amplitude));
      String _plus_44 = (_plus_43 + ");\n\t\t\t\t}\n\t\t\t\n\t\t\t\tprivate static void playSound");
      String _name_5 = it.getName();
      String _plus_45 = (_plus_44 + _name_5);
      String _plus_46 = (_plus_45 + "(){\n\t\t\t\t\tif(!osc");
      String _name_6 = it.getName();
      String _plus_47 = (_plus_46 + _name_6);
      String _plus_48 = (_plus_47 + ".output.isConnected()) {\n\t\t\t            osc");
      String _name_7 = it.getName();
      String _plus_49 = (_plus_48 + _name_7);
      String _plus_50 = (_plus_49 + ".output.connect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_8 = it.getName();
      String _plus_51 = (_plus_50 + _name_8);
      String _plus_52 = (_plus_51 + ".output.connect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t            osc");
      String _name_9 = it.getName();
      String _plus_53 = (_plus_52 + _name_9);
      String _plus_54 = (_plus_53 + ".output.disconnect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_10 = it.getName();
      String _plus_55 = (_plus_54 + _name_10);
      return (_plus_55 + ".output.disconnect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t}\n\t        ");
    };
    String _join_14 = IteratorExtensions.join(IteratorExtensions.<TriangleOscillator, String>map(Iterators.<TriangleOscillator>filter(resource.getAllContents(), TriangleOscillator.class), _function_14), "\n\t\t\t\t");
    String _plus_30 = (_plus_29 + _join_14);
    String _plus_31 = (_plus_30 + "\n\n\t\t\t//SquareOscillator\n\t\t\t");
    final Function1<SquareOscillator, String> _function_15 = (SquareOscillator it) -> {
      String _name = it.getName();
      String _plus_32 = ("private static void createSound" + _name);
      String _plus_33 = (_plus_32 + "() {\n\t\t\t\t");
      String _plus_34 = (_plus_33 + 
        "\tosc");
      String _name_1 = it.getName();
      String _plus_35 = (_plus_34 + _name_1);
      String _plus_36 = (_plus_35 + " = new SquareOscillator();\n\t\t\t\t\t// Add a tone generator.\n\t\t            synth.add(osc");
      String _name_2 = it.getName();
      String _plus_37 = (_plus_36 + _name_2);
      String _plus_38 = (_plus_37 + " );\n\t\t\t\t\n\t\t            // Set the frequency and amplitude for the sine wave.\n\t\t            osc");
      String _name_3 = it.getName();
      String _plus_39 = (_plus_38 + _name_3);
      String _plus_40 = (_plus_39 + ".frequency.set(");
      int _frequency = it.getFrequency();
      String _plus_41 = (_plus_40 + Integer.valueOf(_frequency));
      String _plus_42 = (_plus_41 + ");\n\t\t            osc");
      String _name_4 = it.getName();
      String _plus_43 = (_plus_42 + _name_4);
      String _plus_44 = (_plus_43 + ".amplitude.set(");
      int _amplitude = it.getAmplitude();
      String _plus_45 = (_plus_44 + Integer.valueOf(_amplitude));
      String _plus_46 = (_plus_45 + ");\n\t\t\t\t}\n\t\t\t\n\t\t\t\tprivate static void playSound");
      String _name_5 = it.getName();
      String _plus_47 = (_plus_46 + _name_5);
      String _plus_48 = (_plus_47 + "(){\n\t\t\t\t\tif(!osc");
      String _name_6 = it.getName();
      String _plus_49 = (_plus_48 + _name_6);
      String _plus_50 = (_plus_49 + ".output.isConnected()) {\n\t\t\t            osc");
      String _name_7 = it.getName();
      String _plus_51 = (_plus_50 + _name_7);
      String _plus_52 = (_plus_51 + ".output.connect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_8 = it.getName();
      String _plus_53 = (_plus_52 + _name_8);
      String _plus_54 = (_plus_53 + ".output.connect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t            osc");
      String _name_9 = it.getName();
      String _plus_55 = (_plus_54 + _name_9);
      String _plus_56 = (_plus_55 + ".output.disconnect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_10 = it.getName();
      String _plus_57 = (_plus_56 + _name_10);
      return (_plus_57 + ".output.disconnect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t}\n\t        ");
    };
    String _join_15 = IteratorExtensions.join(IteratorExtensions.<SquareOscillator, String>map(Iterators.<SquareOscillator>filter(resource.getAllContents(), SquareOscillator.class), _function_15), "\n\t\t\t\t");
    String _plus_32 = (_plus_31 + _join_15);
    String _plus_33 = (_plus_32 + "\n\n\t\t\t//PulseOscillator\n\t\t\t");
    final Function1<PulseOscillator, String> _function_16 = (PulseOscillator it) -> {
      String _name = it.getName();
      String _plus_34 = ("private static void createSound" + _name);
      String _plus_35 = (_plus_34 + "() {\n\t\t\t\t");
      String _plus_36 = (_plus_35 + 
        "\tosc");
      String _name_1 = it.getName();
      String _plus_37 = (_plus_36 + _name_1);
      String _plus_38 = (_plus_37 + " = new PulseOscillator();\n\t\t\t\t\t// Add a tone generator.\n\t\t            synth.add(osc");
      String _name_2 = it.getName();
      String _plus_39 = (_plus_38 + _name_2);
      String _plus_40 = (_plus_39 + " );\n\t\t\t\t\n\t\t            // Set the frequency and amplitude for the sine wave.\n\t\t            osc");
      String _name_3 = it.getName();
      String _plus_41 = (_plus_40 + _name_3);
      String _plus_42 = (_plus_41 + ".frequency.set(");
      int _frequency = it.getFrequency();
      String _plus_43 = (_plus_42 + Integer.valueOf(_frequency));
      String _plus_44 = (_plus_43 + ");\n\t\t            osc");
      String _name_4 = it.getName();
      String _plus_45 = (_plus_44 + _name_4);
      String _plus_46 = (_plus_45 + ".amplitude.set(");
      int _amplitude = it.getAmplitude();
      String _plus_47 = (_plus_46 + Integer.valueOf(_amplitude));
      String _plus_48 = (_plus_47 + ");\n\t\t\t\t}\n\t\t\t\n\t\t\t\tprivate static void playSound");
      String _name_5 = it.getName();
      String _plus_49 = (_plus_48 + _name_5);
      String _plus_50 = (_plus_49 + "(){\n\t\t\t\t\tif(!osc");
      String _name_6 = it.getName();
      String _plus_51 = (_plus_50 + _name_6);
      String _plus_52 = (_plus_51 + ".output.isConnected()) {\n\t\t\t            osc");
      String _name_7 = it.getName();
      String _plus_53 = (_plus_52 + _name_7);
      String _plus_54 = (_plus_53 + ".output.connect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_8 = it.getName();
      String _plus_55 = (_plus_54 + _name_8);
      String _plus_56 = (_plus_55 + ".output.connect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t            osc");
      String _name_9 = it.getName();
      String _plus_57 = (_plus_56 + _name_9);
      String _plus_58 = (_plus_57 + ".output.disconnect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_10 = it.getName();
      String _plus_59 = (_plus_58 + _name_10);
      return (_plus_59 + ".output.disconnect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t}\n\t        ");
    };
    String _join_16 = IteratorExtensions.join(IteratorExtensions.<PulseOscillator, String>map(Iterators.<PulseOscillator>filter(resource.getAllContents(), PulseOscillator.class), _function_16), "\n\t\t\t\t");
    String _plus_34 = (_plus_33 + _join_16);
    String _plus_35 = (_plus_34 + "\n\n\t\t\t//ImpulseOscillator\n\t\t\t");
    final Function1<ImpulseOscillator, String> _function_17 = (ImpulseOscillator it) -> {
      String _name = it.getName();
      String _plus_36 = ("private static void createSound" + _name);
      String _plus_37 = (_plus_36 + "() {\n\t\t\t\t");
      String _plus_38 = (_plus_37 + 
        "\tosc");
      String _name_1 = it.getName();
      String _plus_39 = (_plus_38 + _name_1);
      String _plus_40 = (_plus_39 + " = new ImpulseOscillator();\n\t\t\t\t\t// Add a tone generator.\n\t\t            synth.add(osc");
      String _name_2 = it.getName();
      String _plus_41 = (_plus_40 + _name_2);
      String _plus_42 = (_plus_41 + " );\n\t\t\t\t\n\t\t            // Set the frequency and amplitude for the sine wave.\n\t\t            osc");
      String _name_3 = it.getName();
      String _plus_43 = (_plus_42 + _name_3);
      String _plus_44 = (_plus_43 + ".frequency.set(");
      int _frequency = it.getFrequency();
      String _plus_45 = (_plus_44 + Integer.valueOf(_frequency));
      String _plus_46 = (_plus_45 + ");\n\t\t            osc");
      String _name_4 = it.getName();
      String _plus_47 = (_plus_46 + _name_4);
      String _plus_48 = (_plus_47 + ".amplitude.set(");
      int _amplitude = it.getAmplitude();
      String _plus_49 = (_plus_48 + Integer.valueOf(_amplitude));
      String _plus_50 = (_plus_49 + ");\n\t\t\t\t}\n\t\t\t\n\t\t\t\tprivate static void playSound");
      String _name_5 = it.getName();
      String _plus_51 = (_plus_50 + _name_5);
      String _plus_52 = (_plus_51 + "(){\n\t\t\t\t\tif(!osc");
      String _name_6 = it.getName();
      String _plus_53 = (_plus_52 + _name_6);
      String _plus_54 = (_plus_53 + ".output.isConnected()) {\n\t\t\t            osc");
      String _name_7 = it.getName();
      String _plus_55 = (_plus_54 + _name_7);
      String _plus_56 = (_plus_55 + ".output.connect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_8 = it.getName();
      String _plus_57 = (_plus_56 + _name_8);
      String _plus_58 = (_plus_57 + ".output.connect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t            osc");
      String _name_9 = it.getName();
      String _plus_59 = (_plus_58 + _name_9);
      String _plus_60 = (_plus_59 + ".output.disconnect(0, lineOut.input, 0);\n\t\t\t            osc");
      String _name_10 = it.getName();
      String _plus_61 = (_plus_60 + _name_10);
      return (_plus_61 + ".output.disconnect(0, lineOut.input, 1);\n\t\t\t\t\t}\n\t\t\t\t}\n\t        ");
    };
    String _join_17 = IteratorExtensions.join(IteratorExtensions.<ImpulseOscillator, String>map(Iterators.<ImpulseOscillator>filter(resource.getAllContents(), ImpulseOscillator.class), _function_17), "\n\t\t\t\t");
    String _plus_36 = (_plus_35 + _join_17);
    String _plus_37 = (_plus_36 + "\n\n\t\t\tpublic static void main(String[] args) {\n\t\t\t\tSystem.out.println(\"Synthesizer started!\");\n\t\t        SynthesizerDSL applet = new SynthesizerDSL();\n\t\t        JAppletFrame frame = new JAppletFrame(\"Synthesizer\", applet);\n\t\t        frame.setSize(640, 500);\n\t\t        frame.setVisible(true);\n\t\t        frame.test();\n\t\t        frame.validate();\n\t\t\t}\n\t\t}");
    fsa.generateFile("SynthesizerDSL.java", _plus_37);
  }
  
  public String generateUI(final Resource resource) {
    final Function1<Button, String> _function = (Button it) -> {
      String _name = it.getName();
      String _plus = ("JButton b" + _name);
      String _plus_1 = (_plus + " = new JButton(\"b");
      String _name_1 = it.getName();
      String _plus_2 = (_plus_1 + _name_1);
      String _plus_3 = (_plus_2 + "\");\n\n\t\t\t\tb");
      String _name_2 = it.getName();
      String _plus_4 = (_plus_3 + _name_2);
      String _plus_5 = (_plus_4 + ".addActionListener(new ActionListener() {\n\t\t\t        @Override\n\t\t\t        public void actionPerformed(ActionEvent e) {\n\t\t\t            playSound");
      String _name_3 = it.getSound().getName();
      String _plus_6 = (_plus_5 + _name_3);
      String _plus_7 = (_plus_6 + "();\n\t\t\t        }\n\t\t    \t});\n\n\t\t\t\tb");
      String _name_4 = it.getName();
      String _plus_8 = (_plus_7 + _name_4);
      String _plus_9 = (_plus_8 + ".setBounds(");
      int _x = it.getX();
      String _plus_10 = (_plus_9 + Integer.valueOf(_x));
      String _plus_11 = (_plus_10 + ", ");
      int _y = it.getY();
      String _plus_12 = (_plus_11 + Integer.valueOf(_y));
      String _plus_13 = (_plus_12 + ", ");
      int _width = it.getWidth();
      String _plus_14 = (_plus_13 + Integer.valueOf(_width));
      String _plus_15 = (_plus_14 + ", ");
      int _height = it.getHeight();
      String _plus_16 = (_plus_15 + Integer.valueOf(_height));
      String _plus_17 = (_plus_16 + ");  // x, y, width, height\n    \t\t\tb");
      String _name_5 = it.getName();
      String _plus_18 = (_plus_17 + _name_5);
      String _plus_19 = (_plus_18 + ".setPreferredSize(new Dimension(");
      int _width_1 = it.getWidth();
      String _plus_20 = (_plus_19 + Integer.valueOf(_width_1));
      String _plus_21 = (_plus_20 + ", ");
      int _height_1 = it.getHeight();
      String _plus_22 = (_plus_21 + Integer.valueOf(_height_1));
      String _plus_23 = (_plus_22 + "));\t\t\t\t\n        \t\tpanel.add(b");
      String _name_6 = it.getName();
      String _plus_24 = (_plus_23 + _name_6);
      return (_plus_24 + ");\n\n\t\t        ");
    };
    String _join = IteratorExtensions.join(IteratorExtensions.<Button, String>map(Iterators.<Button>filter(resource.getAllContents(), Button.class), _function), "\n\t\t\t\t");
    String _plus = ("private void createAndShowGUI() {\n\t\t        //Create and set up the window.\n        \t\tadd(BorderLayout.NORTH, new JLabel(\"Show Oscillators in an AudioScope\"));\n\t\t        \n\t\t\t\t//Create Panels\n\t\t\t\tJPanel panel = new JPanel();\n        \t\tpanel.setLayout(null);\n        \t\tadd(BorderLayout.CENTER, panel);\n\n\t\t        //Create Buttons\n\t\t\t\t" + _join);
    String _plus_1 = (_plus + "\n\n\t\t\t\t//Example ramp for slider\n\t\t       \tLinearRamp freqRamp = new LinearRamp();\n\t\t        freqRamp.input.setup(50.0, 300.0, 20000.0);\n\t\t        freqRamp.input.setName(\"Frequency\");\n\t\t\t\tfreqRamp.time.set(0.1);\n\n\t\t        //Create Slider\n\t\t\t\t");
    final Function1<Slider, String> _function_1 = (Slider it) -> {
      String _name = it.getName();
      String _plus_2 = ("DoubleBoundedRangeSlider slider" + _name);
      String _plus_3 = (_plus_2 + " = PortControllerFactory.createExponentialPortSlider(osc");
      String _name_1 = it.getSound().getName();
      String _plus_4 = (_plus_3 + _name_1);
      String _plus_5 = (_plus_4 + ".");
      String _type = it.getType();
      String _plus_6 = (_plus_5 + _type);
      String _plus_7 = (_plus_6 + ");\n\t\t\t\tslider");
      String _name_2 = it.getName();
      String _plus_8 = (_plus_7 + _name_2);
      String _plus_9 = (_plus_8 + ".setBounds(");
      int _x = it.getX();
      String _plus_10 = (_plus_9 + Integer.valueOf(_x));
      String _plus_11 = (_plus_10 + ", ");
      int _y = it.getY();
      String _plus_12 = (_plus_11 + Integer.valueOf(_y));
      String _plus_13 = (_plus_12 + ", ");
      int _width = it.getWidth();
      String _plus_14 = (_plus_13 + Integer.valueOf(_width));
      String _plus_15 = (_plus_14 + ", ");
      int _height = it.getHeight();
      String _plus_16 = (_plus_15 + Integer.valueOf(_height));
      String _plus_17 = (_plus_16 + ");  // x, y, width, height\n\t\t\t\tpanel.add(slider");
      String _name_3 = it.getName();
      String _plus_18 = (_plus_17 + _name_3);
      return (_plus_18 + ");");
    };
    String _join_1 = IteratorExtensions.join(IteratorExtensions.<Slider, String>map(Iterators.<Slider>filter(resource.getAllContents(), Slider.class), _function_1), "\n\t\t\t\t");
    String _plus_2 = (_plus_1 + _join_1);
    String _plus_3 = (_plus_2 + "\n\n\n\t\t\t\t//Example input for knobs\n\t\t        Synthesizer synth = JSyn.createSynthesizer();\n\n\t\t        // Add a tone generator. (band limited sawtooth)\n\t\t        SawtoothOscillatorBL osc;\n\t\t        synth.add(osc = new SawtoothOscillatorBL());\n\t\t        // Add a lag to smooth out amplitude changes and avoid pops.\n\t\t        LinearRamp lag;\n\t\t        synth.add(lag = new LinearRamp());\n\t\t        // Add an output mixer.\n\t\t        LineOut lineOut;\n\t\t        synth.add(lineOut = new LineOut());\n\n\t\t        // Connect the oscillator to both left and right output.\n\t\t        osc.output.connect(0, lineOut.input, 0);\n\t\t        osc.output.connect(0, lineOut.input, 1);\n\t\t\n\t\t        // Set the minimum, current and maximum values for the port.\n\t\t        lag.output.connect(osc.amplitude);\n\t\t        lag.input.setup(0.0, 0.5, 1.0);\n\t\t        lag.time.set(0.2);\n\n        \t\tExponentialRangeModel amplitudeModel = PortModelFactory.createExponentialModel(lag.input);\n\n\t\t        //Create RotaryKnob\n\t\t\t\t");
    final Function1<RotaryKnob, String> _function_2 = (RotaryKnob it) -> {
      String _name = it.getName();
      String _plus_4 = ("RotaryTextController knob" + _name);
      String _plus_5 = (_plus_4 + " = new RotaryTextController(amplitudeModel, 10);\n\t\t\t\tknob");
      String _name_1 = it.getName();
      String _plus_6 = (_plus_5 + _name_1);
      String _plus_7 = (_plus_6 + ".setBounds(");
      int _x = it.getX();
      String _plus_8 = (_plus_7 + Integer.valueOf(_x));
      String _plus_9 = (_plus_8 + ", ");
      int _y = it.getY();
      String _plus_10 = (_plus_9 + Integer.valueOf(_y));
      String _plus_11 = (_plus_10 + ", ");
      int _width = it.getWidth();
      String _plus_12 = (_plus_11 + Integer.valueOf(_width));
      String _plus_13 = (_plus_12 + ", ");
      int _height = it.getHeight();
      String _plus_14 = (_plus_13 + Integer.valueOf(_height));
      String _plus_15 = (_plus_14 + ");  // x, y, width, height\n\t\t\t\tpanel.add(knob");
      String _name_2 = it.getName();
      String _plus_16 = (_plus_15 + _name_2);
      return (_plus_16 + ");");
    };
    String _join_2 = IteratorExtensions.join(IteratorExtensions.<RotaryKnob, String>map(Iterators.<RotaryKnob>filter(resource.getAllContents(), RotaryKnob.class), _function_2), "\n\t\t\t\t");
    String _plus_4 = (_plus_3 + _join_2);
    return (_plus_4 + "\n\t\t\t}");
  }
}
