/*
 * generated by Xtext 2.12.0
 */
package org.xtext.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.SynthesizerRuntimeModule
import org.xtext.SynthesizerStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SynthesizerIdeSetup extends SynthesizerStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SynthesizerRuntimeModule, new SynthesizerIdeModule))
	}
	
}
