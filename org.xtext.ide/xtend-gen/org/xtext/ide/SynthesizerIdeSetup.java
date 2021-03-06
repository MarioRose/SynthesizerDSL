/**
 * generated by Xtext 2.12.0
 */
package org.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.SynthesizerRuntimeModule;
import org.xtext.SynthesizerStandaloneSetup;
import org.xtext.ide.SynthesizerIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SynthesizerIdeSetup extends SynthesizerStandaloneSetup {
  @Override
  public Injector createInjector() {
    SynthesizerRuntimeModule _synthesizerRuntimeModule = new SynthesizerRuntimeModule();
    SynthesizerIdeModule _synthesizerIdeModule = new SynthesizerIdeModule();
    return Guice.createInjector(Modules2.mixin(_synthesizerRuntimeModule, _synthesizerIdeModule));
  }
}
