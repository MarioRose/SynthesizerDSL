/*
 * generated by Xtext 2.12.0
 */
package org.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SynthesizerStandaloneSetup extends SynthesizerStandaloneSetupGenerated {

	def static void doSetup() {
		new SynthesizerStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}