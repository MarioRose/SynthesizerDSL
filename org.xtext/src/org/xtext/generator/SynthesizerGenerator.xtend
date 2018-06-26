/*
 * generated by Xtext 2.12.0
 */
package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.synthesizer.Slider
import org.xtext.synthesizer.Button
import org.xtext.synthesizer.RotaryKnob
import org.xtext.synthesizer.SineOscillator
import org.xtext.synthesizer.SawToothOscillator
import org.xtext.synthesizer.PulseOscillator
import org.xtext.synthesizer.SquareOscillator
import org.xtext.synthesizer.TriangleOscillator
import org.xtext.synthesizer.ImpulseOscillator
import org.xtext.synthesizer.Image
import org.xtext.synthesizer.BgColor
import org.xtext.synthesizer.WindowElement
import org.xtext.synthesizer.Piano

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SynthesizerGenerator extends AbstractGenerator {

//	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
//	}
	
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
	// Generate Main Java Class
	fsa.generateFile('SynthesizerDSL.java', '
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.util.Scanner; 
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.awt.BorderLayout;
		import java.awt.GridLayout;
		import java.awt.Dimension;
		import java.awt.Color;
		import java.awt.event.KeyEvent;
		import java.awt.event.MouseEvent;
		import java.awt.event.MouseListener;

		import javax.swing.*;  
		import javax.swing.JApplet;
		import com.jsyn.swing.JAppletFrame;
		import com.jsyn.swing.DoubleBoundedRangeSlider;
		import com.jsyn.swing.PortControllerFactory;

		import com.jsyn.swing.ExponentialRangeModel;
		import com.jsyn.swing.PortModelFactory;
		import com.jsyn.swing.RotaryTextController;

		import com.jsyn.JSyn;
		import com.jsyn.Synthesizer;
		import com.jsyn.unitgen.LineOut;
		import com.jsyn.unitgen.SineOscillator;
		import com.jsyn.unitgen.UnitOscillator;
		import com.jsyn.unitgen.LinearRamp;
		import com.jsyn.unitgen.SawtoothOscillatorBL;
		import com.jsyn.unitgen.SawtoothOscillator;
		import com.jsyn.unitgen.TriangleOscillator;
		import com.jsyn.unitgen.SquareOscillator;
		import com.jsyn.unitgen.PulseOscillator;
		import com.jsyn.unitgen.ImpulseOscillator;
		import com.jsyn.unitgen.UnitFilter;
		import com.jsyn.unitgen.FilterBandPass;
		import com.jsyn.unitgen.FilterLowPass;
		import com.jsyn.unitgen.FilterHighPass;

		public class SynthesizerDSL extends JApplet{
		    static Synthesizer synth;
            static LineOut lineOut;
			double fr = 1.059463094;
				
			//SOUNDS
			'+ resource.allContents
				.filter(SineOscillator)
				.map["private static UnitOscillator osc" + name + ";	
				"+ if(!key.toString.equals("XX")) {"boolean pressed_" + key + " = true;"} else{" "} +" 	             
				"].join('\n\t\t\t\t')
			+ resource.allContents
				.filter(SineOscillator)
				.map[if(!filter.toString.equals("XX")) {"static UnitFilter filter_" + name + ";"} else{""} 	             				
				].join('\n\t\t\t\t')
			+
			resource.allContents
				.filter(SawToothOscillator)
				.map["private static UnitOscillator osc" + name + ";
				"+ if(!key.toString.equals('XX')) {"boolean pressed_" + key + " = true;"} else{""} + "    
				"].join('\n\t\t\t\t')
			+ resource.allContents
			.filter(SawToothOscillator)
				.map[if(!filter.toString.equals("XX")) {"static UnitFilter filter_" + name + ";"} else{""} 	              								
				].join('\n\t\t\t\t')
			+
			resource.allContents
				.filter(TriangleOscillator)
				.map["private static UnitOscillator osc" + name + ";	   
				"+ if(!key.toString.equals("XX")) {"boolean pressed_" + key + " = true;"} else{""} + "	           
				"].join('\n\t\t\t\t')
			+ resource.allContents
			.filter(TriangleOscillator)
				.map[if(!filter.toString.equals("XX")) {"static UnitFilter filter_" + name + ";"} else{""} 	              								
				].join('\n\t\t\t\t')
			+
			resource.allContents
				.filter(SquareOscillator)
				.map["private static UnitOscillator osc" + name + ";	
				"+ if(!key.toString.equals("XX")) {"boolean pressed_" + key + " = true;"} else{""} + "	              
				"].join('\n\t\t\t\t')
			+ resource.allContents
			.filter(SquareOscillator)
				.map[if(!filter.toString.equals("XX")) {"static UnitFilter filter_" + name + ";"} else{""} 	              								
				].join('\n\t\t\t\t')
			+
			resource.allContents
				.filter(PulseOscillator)
				.map["private static UnitOscillator osc" + name + ";	   
				"+ if(!key.toString.equals("XX")) {"boolean pressed_" + key + " = true;"} else{""} + "           
				"].join('\n\t\t\t\t')
			+ resource.allContents
			.filter(PulseOscillator)
				.map[if(!filter.toString.equals("XX")) {"static UnitFilter filter_" + name + ";"} else{""} 	              								
				].join('\n\t\t\t\t')
			+
			resource.allContents
				.filter(ImpulseOscillator)
				.map["private static UnitOscillator osc" + name + ";	
				"+ if(!key.toString.equals("XX")) {"boolean pressed_" + key + " = true;"} else{""} + " 	              
				"].join('\n\t\t\t\t')
			+ resource.allContents
			.filter(ImpulseOscillator)
				.map[if(!filter.toString.equals("XX")) {"static UnitFilter filter_" + name + ";"} else{""} 	              								
				].join('\n\t\t\t\t')
			+ '

			' + generateUI(resource) + '

		    @Override
		    public void start() {
	        	// Create a context for the synthesizer.
	            synth = JSyn.createSynthesizer();
	            // Start synthesizer using default stereo output at 44100 Hz.
	            synth.start();
	            // Add a stereo audio output unit.
	            synth.add(lineOut = new LineOut());
	            // We only need to start the LineOut. It will pull data from the
	            // oscillator.
	            lineOut.start();

				'+ resource.allContents
				.filter(SineOscillator)
				.map["createSound" + name + "();
				"+ if(!filter.toString.equals("XX")) {"filter_" + name + " = new " + filter.toString() + "();
				synth.add(filter_" + name + ");
				filter_" + name + ".output.connect(0, lineOut.input, 0);
	            filter_" + name + ".output.connect(0, lineOut.input, 1);
				"} else{""} + " 	              					       
				"].join('\n\t\t\t\t')
				+
				resource.allContents
				.filter(SawToothOscillator)
				.map["createSound" + name + "();
				"+ if(!filter.toString.equals("XX")) {"filter_" + name + " = new " + filter.toString() + "();
				synth.add(filter_" + name + ");
				filter_" + name + ".output.connect(0, lineOut.input, 0);
	            filter_" + name + ".output.connect(0, lineOut.input, 1);
				"} else{""} + " 	              					       	       
				"].join('\n\t\t\t\t')
				+ 
				resource.allContents
				.filter(TriangleOscillator)
				.map["createSound" + name + "();
				"+ if(!filter.toString.equals("XX")) {"filter_" + name + " = new " + filter.toString() + "();
				synth.add(filter_" + name + ");
				filter_" + name + ".output.connect(0, lineOut.input, 0);
	            filter_" + name + ".output.connect(0, lineOut.input, 1);
				"} else{""} + " 	              					       	       	       
				"].join('\n\t\t\t\t')
				+
				resource.allContents
				.filter(SquareOscillator)
				.map["createSound" + name + "();
				"+ if(!filter.toString.equals("XX")) {"filter_" + name + " = new " + filter.toString() + "();
				synth.add(filter_" + name + ");
				filter_" + name + ".output.connect(0, lineOut.input, 0);
	            filter_" + name + ".output.connect(0, lineOut.input, 1);
				"} else{""} + " 	              					       	       	       
				"].join('\n\t\t\t\t')
				+
				resource.allContents
				.filter(PulseOscillator)
				.map["createSound" + name + "();
				"+ if(!filter.toString.equals("XX")) {"filter_" + name + " = new " + filter.toString() + "();
				synth.add(filter_" + name + ");
				filter_" + name + ".output.connect(0, lineOut.input, 0);
	            filter_" + name + ".output.connect(0, lineOut.input, 1);
				"} else{""} + " 	              					       	       	       
				"].join('\n\t\t\t\t')
				+ '
		    	createAndShowGUI();
			}
			

			//---- Create Sounds ----
			//SineOscillators
			'+ resource.allContents
			.filter(SineOscillator)
			.map["private static void createSound" + name + "() {\n\t\t\t\t" + 
        		'	osc' + name + ' = new SineOscillator();
					// Add a tone generator.
		            synth.add(osc' + name + ' );
				
		            // Set the frequency and amplitude for the sine wave.
		            osc' + name + '.frequency.set(' + frequency.predecimal + '.' + frequency.decimal + ');
		            osc' + name + '.amplitude.set(' + amplitude.predecimal + '.' + amplitude.decimal + ');
				}
			
				private static void playSound' + name + '(){

				'+ if(!filter.toString.equals("XX")) {'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(filter_' + name + '.input);
					}
					else {
			            osc' + name + '.output.disconnect(filter_' + name + '.input);
					}
				}
					'} 
					else{'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(0, lineOut.input, 0);
			            osc' + name + '.output.connect(0, lineOut.input, 1);
					}
					else {
			            osc' + name + '.output.disconnect(0, lineOut.input, 0);
			            osc' + name + '.output.disconnect(0, lineOut.input, 1);
					}
					'} + '	              					       
				}
	        '].join('\n\t\t\t\t')

		    + '

			//SawtoothOscillator
			'+ resource.allContents
			.filter(SawToothOscillator)
			.map["private static void createSound" + name + "() {\n\t\t\t\t" + 
        		'	osc' + name + ' = new SawtoothOscillator();
					// Add a tone generator.
		            synth.add(osc' + name + ' );
				
		            // Set the frequency and amplitude for the sine wave.
		            osc' + name + '.frequency.set(' + frequency.predecimal + '.' + frequency.decimal + ');
		            osc' + name + '.amplitude.set(' + amplitude.predecimal + '.' + amplitude.decimal + ');
				}
			
				private static void playSound' + name + '(){
				'+ if(!filter.toString.equals("XX")) {'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(filter_' + name + '.input);
					}
					else {
			            osc' + name + '.output.disconnect(filter_' + name + '.input);
					}
				}
					'} 
					else{'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(0, lineOut.input, 0);
			            osc' + name + '.output.connect(0, lineOut.input, 1);
					}
					else {
			            osc' + name + '.output.disconnect(0, lineOut.input, 0);
			            osc' + name + '.output.disconnect(0, lineOut.input, 1);
					}
					'} + '}	              					       
				}
	        '].join('\n\t\t\t\t')

		    + '

			//TriangleOscillator
			'+ resource.allContents
			.filter(TriangleOscillator)
			.map["private static void createSound" + name + "() {\n\t\t\t\t" + 
        		'	osc' + name + ' = new TriangleOscillator();
					// Add a tone generator.
		            synth.add(osc' + name + ' );
				
		            // Set the frequency and amplitude for the sine wave.
		            osc' + name + '.frequency.set(' + frequency.predecimal + '.' + frequency.decimal + ');
		            osc' + name + '.amplitude.set(' + amplitude.predecimal + '.' + amplitude.decimal + ');
				}
			
				private static void playSound' + name + '(){
				'+ if(!filter.toString.equals("XX")) {'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(filter_' + name + '.input);
					}
					else {
			            osc' + name + '.output.disconnect(filter_' + name + '.input);
					}
				}
					'} 
					else{'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(0, lineOut.input, 0);
			            osc' + name + '.output.connect(0, lineOut.input, 1);
					}
					else {
			            osc' + name + '.output.disconnect(0, lineOut.input, 0);
			            osc' + name + '.output.disconnect(0, lineOut.input, 1);
					}
					'} + '}	              					       
				}
	        '].join('\n\t\t\t\t')

		    + '

			//SquareOscillator
			'+ resource.allContents
			.filter(SquareOscillator)
			.map["private static void createSound" + name + "() {\n\t\t\t\t" + 
        		'	osc' + name + ' = new SquareOscillator();
					// Add a tone generator.
		            synth.add(osc' + name + ' );
				
		            // Set the frequency and amplitude for the sine wave.
		            osc' + name + '.frequency.set(' + frequency.predecimal + '.' + frequency.decimal + ');
		            osc' + name + '.amplitude.set(' + amplitude.predecimal + '.' + amplitude.decimal + ');
				}
			
				private static void playSound' + name + '(){
				'+ if(!filter.toString.equals("XX")) {'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(filter_' + name + '.input);
					}
					else {
			            osc' + name + '.output.disconnect(filter_' + name + '.input);
					}
				}
					'} 
					else{'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(0, lineOut.input, 0);
			            osc' + name + '.output.connect(0, lineOut.input, 1);
					}
					else {
			            osc' + name + '.output.disconnect(0, lineOut.input, 0);
			            osc' + name + '.output.disconnect(0, lineOut.input, 1);
					}
					'} + '}	              					       
				}
	        '].join('\n\t\t\t\t')

		    + '

			//PulseOscillator
			'+ resource.allContents
			.filter(PulseOscillator)
			.map["private static void createSound" + name + "() {\n\t\t\t\t" + 
        		'	osc' + name + ' = new PulseOscillator();
					// Add a tone generator.
		            synth.add(osc' + name + ' );
				
		            // Set the frequency and amplitude for the sine wave.
		            osc' + name + '.frequency.set(' + frequency.predecimal + '.' + frequency.decimal + ');
		            osc' + name + '.amplitude.set(' + amplitude.predecimal + '.' + amplitude.decimal + ');
				}
			
				private static void playSound' + name + '(){
				'+ if(!filter.toString.equals("XX")) {'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(filter_' + name + '.input);
					}
					else {
			            osc' + name + '.output.disconnect(filter_' + name + '.input);
					}
				}
					'} 
					else{'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(0, lineOut.input, 0);
			            osc' + name + '.output.connect(0, lineOut.input, 1);
					}
					else {
			            osc' + name + '.output.disconnect(0, lineOut.input, 0);
			            osc' + name + '.output.disconnect(0, lineOut.input, 1);
					}
					'} +'	              					       
				}
	        '].join('\n\t\t\t\t')

		    + '

			//ImpulseOscillator
			'+ resource.allContents
			.filter(ImpulseOscillator)
			.map["private static void createSound" + name + "() {\n\t\t\t\t" + 
        		'	osc' + name + ' = new ImpulseOscillator();
					// Add a tone generator.
		            synth.add(osc' + name + ' );
				
		            // Set the frequency and amplitude for the sine wave.
		            osc' + name + '.frequency.set(' + frequency.predecimal + '.' + frequency.decimal + ');
		            osc' + name + '.amplitude.set(' + amplitude.predecimal + '.' + amplitude.decimal + ');
				}
			
				private static void playSound' + name + '(){
				'+ if(!filter.toString.equals("XX")) {'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(filter_' + name + '.input);
					}
					else {
			            osc' + name + '.output.disconnect(filter_' + name + '.input);
					}
				}
					'} 
					else{'
					if(!osc' + name + '.output.isConnected()) {
			            osc' + name + '.output.connect(0, lineOut.input, 0);
			            osc' + name + '.output.connect(0, lineOut.input, 1);
					}
					else {
			            osc' + name + '.output.disconnect(0, lineOut.input, 0);
			            osc' + name + '.output.disconnect(0, lineOut.input, 1);
					}
					'} + '}	              					       
				}
	        '].join('\n\t\t\t\t')

		    + '

			public static void main(String[] args) {
				System.out.println("Synthesizer started!");
		        SynthesizerDSL applet = new SynthesizerDSL();
		        JAppletFrame frame = new JAppletFrame("Synthesizer", applet);
				int width = 0;
				int height = 0;
				'+ resource.allContents
				.filter(WindowElement)
				.map['width = ' + width + ';
 				height = ' + height + ';'].join('\n\t\t\t\t') + '
				if (width < 300)
					width = 800;
				if (height < 200)
					height = 600;
		        frame.setSize(width, height);
		        frame.setVisible(true);
		        frame.test();
		        frame.validate();
			}




			' + generateKeyBinding(resource) +'
		}' 
		)
	}
		
	def String generateUI(Resource resource){	
			return 'private void createAndShowGUI() {
		        
				//Create Panels
				JPanel panel = new JPanel();
				setKeyBindings(panel);
        		panel.setLayout(null);
        		add(BorderLayout.CENTER, panel);
        		panel.requestFocusInWindow();

		        //Create Buttons
				'+ resource.allContents
				.filter(Button)
				.map["JButton b" + name + " = new JButton();
				b" + name + '.addMouseListener(new MouseListener(){
					public void mousePressed(MouseEvent e) {
			            playSound' + sound.name + '();
					}
	
					public void mouseReleased(MouseEvent e) {
			            playSound' + sound.name + '();
					}
	
					public void mouseClicked(MouseEvent e) {
					}
	
					@Override
					public void mouseEntered(MouseEvent arg0) {						
					}
	
					@Override
					public void mouseExited(MouseEvent e) {						
					}
		    	});

				b' + name + '.setBounds(' + x + ', ' + y + ', ' + width + ', ' + height + ');  // x, y, width, height
    			b' + name + '.setPreferredSize(new Dimension(' + width +', ' + height +'));		
				b' + name + '.setText(\"' + label + '\");
				if (b' + name + '.getText().equals(\"null\"))
					b' + name + '.setText("");
				b' + name + '.setBackground(Color.' + bgColor + ');
        		panel.add(b' + name + ');

		        '].join('\n\t\t\t\t')
		        + '

				//Create Images
				'+ resource.allContents
				.filter(Image)
				.map["ImageIcon image" + name + " = new ImageIcon(\"" + path + "\");\n"
				+ '
				JLabel imagelabel' + name + ' = new JLabel(image' + name + ');

				imagelabel' + name + '.setBounds(' + x + ', ' + y + ', ' + width + ', ' + height + ');  // x, y, width, height
    			imagelabel' + name + '.setPreferredSize(new Dimension(' + width +', ' + height +'));				
        		panel.add(imagelabel' + name + ');

		        '].join('\n\t\t\t\t')
		        + '

				//Create Pianos
				'+ resource.allContents
				.filter(Piano)
				.map['for (int i = (4 + (' + octave + ' - 1)*12); i < (16 + (' + octave + ' - 1)*12); i++) {
        			UnitOscillator oscb = new SineOscillator();
		            synth.add(oscb);
		            oscb.frequency.set(Math.pow(fr, i-49) * 440.00);
		            oscb.amplitude.set(1.0);
		            int key = i % 12;
		            if (key == 0)
		            	key = 12;
		            System.out.println("key: " + key);
        			JButton b = new JButton();
    				b.addMouseListener(new MouseListener(){
    					public void mousePressed(MouseEvent e) {
    						oscb.output.connect(0, lineOut.input, 0);
    			            oscb.output.connect(0, lineOut.input, 1);
    					}
    	
    					public void mouseReleased(MouseEvent e) {
    						oscb.output.disconnect(0, lineOut.input, 0);
    			            oscb.output.disconnect(0, lineOut.input, 1);
    					}
    	
    					public void mouseClicked(MouseEvent e) {
    					}
    	
    					@Override
    					public void mouseEntered(MouseEvent arg0) {						
    					}
    	
    					@Override
    					public void mouseExited(MouseEvent e) {						
    					}
    		    	});
    				int startX = ' + x + ';
    				int startY = ' + y + ';
    				int kw = (int) ' + (width / 9) + ';
    				int kwb = (int) ' + (width / 22.5) + ';
    				int kh = (int) ' + height + ';
    				int khb = (int) ' + height * 0.8 + ';
    				if (key == 2 || key == 5 || key == 7 || key == 10 || key == 12) {
    					b.setBackground(Color.black);
    					if (key == 5)
    						b.setBounds(startX + kw, startY, kwb, khb);
    					else if (key == 7)
    						b.setBounds(startX + kw*2 + kwb, startY, kwb, khb);
    					else if (key == 10)
    						b.setBounds(startX + kw*4 + kwb*2, startY, kwb, khb);
    					else if (key == 12)
    						b.setBounds(startX + kw*5 + kwb*3, startY, kwb, khb);
    					if (key == 2)
    						b.setBounds(startX + kw*6 + kwb*4, startY, kwb, khb);
    				}
    				else {
    					b.setBackground(Color.white);
    				    if (key == 4) {
    						b.setText("C");
        					b.setBounds(startX, startY, kw, kh);
    					} else if (key == 6) {
    						b.setText("D");
        					b.setBounds(startX + kw + kwb, startY, kw, kh);
    					} else if (key == 8) {
    						b.setText("E");
        					b.setBounds(startX + kw*2 + kwb*2, startY, kw, kh);
    					} else if (key == 9) {
    						b.setText("F");
        					b.setBounds(startX + kw*3 + kwb*2, startY, kw, kh);
    					} else if (key == 11) {
    						b.setText("G");
        					b.setBounds(startX + kw*4 + kwb*3, startY, kw, kh);
    					} else if (key == 1) {
    						b.setText("A");
        					b.setBounds(startX + kw*5 + kwb*4, startY, kw, kh);
    					} else if (key == 3) {
    						b.setText("B");
        					b.setBounds(startX + kw*6 + kwb*5, startY, kw, kh);
    					}
						if (kw < 42)
    				    	b.setText("");
    				}
            		panel.add(b);
        		}'].join('\n\t\t\t\t')
		        + '

		        //Create Sliders
				'+ resource.allContents
				.filter(Slider)
				.map[
				if(rampType !== null){
				"LinearRamp " + name + "lag = new LinearRamp();
				synth.add(" + name + "lag);
				" + name + "lag.output.connect(osc"+ sound.name + "." + type + ");
				DoubleBoundedRangeSlider slider" + name + ' = PortControllerFactory.createExponentialPortSlider(' + name + 'lag .input);
				slider' + name + '.setBounds(' + x + ', ' + y + ', ' + width + ', ' + height + ');  // x, y, width, height
				panel.add(slider' + name +");"
					
				}
				else{
				"DoubleBoundedRangeSlider slider" + name + ' = PortControllerFactory.createExponentialPortSlider(osc'+ sound.name + '.' + type + ');
				slider' + name + '.setBounds(' + x + ', ' + y + ', ' + width + ', ' + height + ');  // x, y, width, height
				panel.add(slider' + name +");"
				}
				].join('\n\t\t\t\t')  
				+ '

		        //Create RotaryKnobs
				'+ resource.allContents
				.filter(RotaryKnob)
				.map["ExponentialRangeModel model" + name +" = PortModelFactory.createExponentialModel(osc"+ sound.name + "." + type + ");
				RotaryTextController knob" + name + ' = new RotaryTextController(model' + name +', 1);
				knob' + name + '.setBounds(' + x + ', ' + y + ', ' + width + ', ' + height + ');  // x, y, width, height
				panel.add(knob' + name +");"].join('\n\t\t\t\t')
						   
				+ '
			}'
		}
		
		def String generateKeyBinding(Resource resource){
		return 'private void setKeyBindings(final JPanel panel) {		 
			'+ resource.allContents
				.filter(SawToothOscillator)
				.map[if(!key.toString.equals("XX")){'
				panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key +', 0, false), "' + key + '_pressed");
		        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key + ', 0, true), "' + key + '_released");
		
		        panel.getActionMap().put("' + key + '_pressed", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(pressed_' + key + ') {
		            		pressed_' + key + ' = false;
			            	playSound' + name + '();
		            	}
		            }
		        });
		        panel.getActionMap().put("' + key + '_released", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(!pressed_' + key + ') {
		            		pressed_' + key + ' = true;
			            	playSound' + name + '();
		            	}
		            }b
		        });'} else{""}
				].join('\n\t\t\t\t')
			+ '
			'+ resource.allContents
				.filter(SineOscillator)
				.map[if(!key.toString.equals("XX")){'
				panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key +', 0, false), "' + key + '_pressed");
		        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key + ', 0, true), "' + key + '_released");
		
		        panel.getActionMap().put("' + key + '_pressed", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(pressed_' + key + ') {
		            		pressed_' + key + ' = false;
			            	playSound' + name + '();
		            	}
		            }
		        });
		        panel.getActionMap().put("' + key + '_released", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(!pressed_' + key + ') {
		            		pressed_' + key + ' = true;
			            	playSound' + name + '();
		            	}
		            }
		        });'} else{""}
				].join('\n\t\t\t\t')
			+ '
			'+ resource.allContents
				.filter(TriangleOscillator)
				.map[if(!key.toString.equals("XX")){'
				panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key +', 0, false), "' + key + '_pressed");
		        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key + ', 0, true), "' + key + '_released");
		
		        panel.getActionMap().put("' + key + '_pressed", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(pressed_' + key + ') {
		            		pressed_' + key + ' = false;
			            	playSound' + name + '();
		            	}
		            }
		        });
		        panel.getActionMap().put("' + key + '_released", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(!pressed_' + key + ') {
		            		pressed_' + key + ' = true;
			            	playSound' + name + '();
		            	}
		            }
		        });'} else{""}
				].join('\n\t\t\t\t')
			+ '
			'+ resource.allContents
				.filter(SquareOscillator)
				.map[if(!key.toString.equals("XX")){'
				panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key +', 0, false), "' + key + '_pressed");
		        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key + ', 0, true), "' + key + '_released");
		
		        panel.getActionMap().put("' + key + '_pressed", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(pressed_' + key + ') {
		            		pressed_' + key + ' = false;
			            	playSound' + name + '();
		            	}
		            }
		        });
		        panel.getActionMap().put("' + key + '_released", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(!pressed_' + key + ') {
		            		pressed_' + key + ' = true;
			            	playSound' + name + '();
		            	}
		            }
		        });'} else{}
				].join('\n\t\t\t\t')
			+ '
			'+ resource.allContents
				.filter(PulseOscillator)
				.map[if(!key.toString.equals("XX")){'
				panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key +', 0, false), "' + key + '_pressed");
		        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key + ', 0, true), "' + key + '_released");
		
		        panel.getActionMap().put("' + key + '_pressed", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(pressed_' + key + ') {
		            		pressed_' + key + ' = false;
			            	playSound' + name + '();
		            	}
		            }
		        });
		        panel.getActionMap().put("' + key + '_released", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(!pressed_' + key + ') {
		            		pressed_' + key + ' = true;
			            	playSound' + name + '();
		            	}
		            }
		        });'} else {""}
				].join('\n\t\t\t\t')
			+ '
			'+ resource.allContents
				.filter(ImpulseOscillator)
				.map[if(!key.toString.equals("XX")){'
				panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key +', 0, false), "' + key + '_pressed");
		        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_' + key + ', 0, true), "' + key + '_released");
		
		        panel.getActionMap().put("' + key + '_pressed", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(pressed_' + key + ') {
		            		pressed_' + key + ' = false;
			            	playSound' + name + '();
		            	}
		            }
		        });
		        panel.getActionMap().put("' + key + '_released", new AbstractAction() {
		            @Override
		            public void actionPerformed(ActionEvent ae) {
		            	if(!pressed_' + key + ') {
		            		pressed_' + key + ' = true;
			            	playSound' + name + '();
		            	}
		            }
		        });'} else{""}
				].join('\n\t\t\t\t')
			+ '
		}'
	}
		
}
