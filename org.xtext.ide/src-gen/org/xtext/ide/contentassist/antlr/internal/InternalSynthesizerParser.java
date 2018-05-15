package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.SynthesizerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSynthesizerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Button'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSynthesizerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSynthesizerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSynthesizerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSynthesizer.g"; }


    	private SynthesizerGrammarAccess grammarAccess;

    	public void setGrammarAccess(SynthesizerGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalSynthesizer.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSynthesizer.g:54:1: ( ruleModel EOF )
            // InternalSynthesizer.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSynthesizer.g:62:1: ruleModel : ( ( rule__Model__ControlsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:66:2: ( ( ( rule__Model__ControlsAssignment )* ) )
            // InternalSynthesizer.g:67:2: ( ( rule__Model__ControlsAssignment )* )
            {
            // InternalSynthesizer.g:67:2: ( ( rule__Model__ControlsAssignment )* )
            // InternalSynthesizer.g:68:3: ( rule__Model__ControlsAssignment )*
            {
             before(grammarAccess.getModelAccess().getControlsAssignment()); 
            // InternalSynthesizer.g:69:3: ( rule__Model__ControlsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSynthesizer.g:69:4: rule__Model__ControlsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ControlsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getControlsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleControls"
    // InternalSynthesizer.g:78:1: entryRuleControls : ruleControls EOF ;
    public final void entryRuleControls() throws RecognitionException {
        try {
            // InternalSynthesizer.g:79:1: ( ruleControls EOF )
            // InternalSynthesizer.g:80:1: ruleControls EOF
            {
             before(grammarAccess.getControlsRule()); 
            pushFollow(FOLLOW_1);
            ruleControls();

            state._fsp--;

             after(grammarAccess.getControlsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleControls"


    // $ANTLR start "ruleControls"
    // InternalSynthesizer.g:87:1: ruleControls : ( ( rule__Controls__Group__0 ) ) ;
    public final void ruleControls() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:91:2: ( ( ( rule__Controls__Group__0 ) ) )
            // InternalSynthesizer.g:92:2: ( ( rule__Controls__Group__0 ) )
            {
            // InternalSynthesizer.g:92:2: ( ( rule__Controls__Group__0 ) )
            // InternalSynthesizer.g:93:3: ( rule__Controls__Group__0 )
            {
             before(grammarAccess.getControlsAccess().getGroup()); 
            // InternalSynthesizer.g:94:3: ( rule__Controls__Group__0 )
            // InternalSynthesizer.g:94:4: rule__Controls__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Controls__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getControlsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleControls"


    // $ANTLR start "rule__Controls__Group__0"
    // InternalSynthesizer.g:102:1: rule__Controls__Group__0 : rule__Controls__Group__0__Impl rule__Controls__Group__1 ;
    public final void rule__Controls__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:106:1: ( rule__Controls__Group__0__Impl rule__Controls__Group__1 )
            // InternalSynthesizer.g:107:2: rule__Controls__Group__0__Impl rule__Controls__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Controls__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controls__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controls__Group__0"


    // $ANTLR start "rule__Controls__Group__0__Impl"
    // InternalSynthesizer.g:114:1: rule__Controls__Group__0__Impl : ( 'Button' ) ;
    public final void rule__Controls__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:118:1: ( ( 'Button' ) )
            // InternalSynthesizer.g:119:1: ( 'Button' )
            {
            // InternalSynthesizer.g:119:1: ( 'Button' )
            // InternalSynthesizer.g:120:2: 'Button'
            {
             before(grammarAccess.getControlsAccess().getButtonKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getControlsAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controls__Group__0__Impl"


    // $ANTLR start "rule__Controls__Group__1"
    // InternalSynthesizer.g:129:1: rule__Controls__Group__1 : rule__Controls__Group__1__Impl ;
    public final void rule__Controls__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:133:1: ( rule__Controls__Group__1__Impl )
            // InternalSynthesizer.g:134:2: rule__Controls__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controls__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controls__Group__1"


    // $ANTLR start "rule__Controls__Group__1__Impl"
    // InternalSynthesizer.g:140:1: rule__Controls__Group__1__Impl : ( ( rule__Controls__NameAssignment_1 ) ) ;
    public final void rule__Controls__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:144:1: ( ( ( rule__Controls__NameAssignment_1 ) ) )
            // InternalSynthesizer.g:145:1: ( ( rule__Controls__NameAssignment_1 ) )
            {
            // InternalSynthesizer.g:145:1: ( ( rule__Controls__NameAssignment_1 ) )
            // InternalSynthesizer.g:146:2: ( rule__Controls__NameAssignment_1 )
            {
             before(grammarAccess.getControlsAccess().getNameAssignment_1()); 
            // InternalSynthesizer.g:147:2: ( rule__Controls__NameAssignment_1 )
            // InternalSynthesizer.g:147:3: rule__Controls__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Controls__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getControlsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controls__Group__1__Impl"


    // $ANTLR start "rule__Model__ControlsAssignment"
    // InternalSynthesizer.g:156:1: rule__Model__ControlsAssignment : ( ruleControls ) ;
    public final void rule__Model__ControlsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:160:1: ( ( ruleControls ) )
            // InternalSynthesizer.g:161:2: ( ruleControls )
            {
            // InternalSynthesizer.g:161:2: ( ruleControls )
            // InternalSynthesizer.g:162:3: ruleControls
            {
             before(grammarAccess.getModelAccess().getControlsControlsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleControls();

            state._fsp--;

             after(grammarAccess.getModelAccess().getControlsControlsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ControlsAssignment"


    // $ANTLR start "rule__Controls__NameAssignment_1"
    // InternalSynthesizer.g:171:1: rule__Controls__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Controls__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSynthesizer.g:175:1: ( ( RULE_ID ) )
            // InternalSynthesizer.g:176:2: ( RULE_ID )
            {
            // InternalSynthesizer.g:176:2: ( RULE_ID )
            // InternalSynthesizer.g:177:3: RULE_ID
            {
             before(grammarAccess.getControlsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getControlsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controls__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}