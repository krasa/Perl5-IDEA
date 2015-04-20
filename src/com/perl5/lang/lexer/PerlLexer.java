/* The following code was generated by JFlex 1.4.3 on 20.04.15 22:23 */

package com.perl5.lang.lexer;

/*
    http://jflex.de/manual.html
    http://www2.cs.tum.edu/projects/cup

*/

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import com.perl5.lang.lexer.elements.PerlFunction;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 20.04.15 22:23 from the specification file
 * <tt>C:/Repository/Perl5-IDEA/src/com/perl5/lang/lexer/Perl.flex</tt>
 */
public class PerlLexer extends PerlLexerProto implements FlexLexer, PerlTokenTypes {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int FUNCTION_DEFINITION = 4;
  public static final int LEX_REQUIRE = 8;
  public static final int PACKAGE_INSTANCE_CALL = 14;
  public static final int PACKAGE_USE = 6;
  public static final int LEX_DEREFERENCE = 20;
  public static final int LEX_EOF = 16;
  public static final int PACKAGE_STATIC_CALL = 12;
  public static final int YYINITIAL = 0;
  public static final int PACKAGE_USE_PARAMS = 10;
  public static final int LEX_POD = 18;
  public static final int PACKAGE_DEFINITION = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  1,  1,  4,  4,  5,  5,  6,  6, 
     7,  7,  8,  8,  9, 9
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\4\1\0\1\2\1\1\22\0\1\2\1\66\1\7"+
    "\1\53\1\46\1\50\1\75\1\10\1\60\1\61\1\51\1\65\1\62"+
    "\1\44\1\52\1\71\1\5\1\26\1\26\1\26\1\26\5\5\1\43"+
    "\1\3\1\73\1\17\1\45\1\70\1\47\1\15\2\6\1\14\1\12"+
    "\10\6\1\13\5\6\1\16\6\6\1\56\1\70\1\57\1\70\1\11"+
    "\1\0\1\25\1\34\1\35\1\22\1\24\1\41\1\37\1\23\1\31"+
    "\1\6\1\36\1\74\1\33\1\40\1\21\1\20\1\64\1\30\1\63"+
    "\1\32\1\42\1\27\1\6\1\72\2\6\1\54\1\76\1\55\1\67"+
    "\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\12\0\1\1\1\2\1\3\1\4\1\5\2\1\1\4"+
    "\1\6\11\5\3\6\2\1\2\6\1\1\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\5\11\6"+
    "\1\4\1\17\1\6\1\4\1\20\1\4\1\21\1\4"+
    "\1\22\1\4\1\23\1\4\1\24\2\25\1\0\2\26"+
    "\1\0\1\5\4\0\1\27\1\0\1\22\1\4\7\0"+
    "\1\5\1\6\3\5\1\30\1\5\1\31\1\4\1\32"+
    "\1\33\1\0\1\34\1\0\1\35\1\0\1\36\1\0"+
    "\1\6\1\7\1\5\1\6\3\0\1\5\1\37\1\40"+
    "\1\4\2\5\10\0\2\5\1\41\1\42\2\37\2\0"+
    "\2\5\6\0\2\5\1\0\2\5\2\43\3\0\2\5"+
    "\2\44\1\5\1\0\2\5\1\45\1\0\1\46\1\47"+
    "\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\77\0\176\0\275\0\374\0\u013b\0\u017a\0\u01b9"+
    "\0\u01f8\0\u0237\0\u0276\0\u02b5\0\u0276\0\u02f4\0\u0333\0\u0372"+
    "\0\u03b1\0\u03f0\0\u042f\0\u046e\0\u04ad\0\u04ec\0\u052b\0\u056a"+
    "\0\u05a9\0\u05e8\0\u0627\0\u0666\0\u06a5\0\u06e4\0\u0723\0\u0762"+
    "\0\u07a1\0\u07e0\0\u081f\0\u085e\0\u089d\0\u0276\0\u0276\0\u0276"+
    "\0\u0276\0\u0276\0\u0276\0\u0276\0\u08dc\0\u091b\0\u095a\0\u0999"+
    "\0\u0276\0\u09d8\0\u0a17\0\u0a56\0\u0a95\0\u0ad4\0\u0b13\0\u0b52"+
    "\0\u0b91\0\u0bd0\0\u0c0f\0\u0c4e\0\u0c8d\0\u0ccc\0\u0d0b\0\u0d4a"+
    "\0\u0d89\0\u0dc8\0\u0e07\0\u01b9\0\u0e46\0\u0e85\0\u0e85\0\u0ec4"+
    "\0\u0f03\0\u0f42\0\u0f81\0\u0fc0\0\u0fff\0\u0372\0\u0276\0\u03b1"+
    "\0\u0276\0\u103e\0\u107d\0\u10bc\0\u10fb\0\u113a\0\u1179\0\u11b8"+
    "\0\u11f7\0\u1236\0\u0333\0\u1275\0\u12b4\0\u12f3\0\u1332\0\u1371"+
    "\0\u0276\0\u13b0\0\u0276\0\u13ef\0\u0762\0\u142e\0\u07a1\0\u146d"+
    "\0\u07e0\0\u14ac\0\u14eb\0\u152a\0\u1569\0\u15a8\0\u15e7\0\u1626"+
    "\0\u1665\0\u16a4\0\u1332\0\u16e3\0\u0276\0\u0fff\0\u1722\0\u1761"+
    "\0\u17a0\0\u17df\0\u181e\0\u185d\0\u189c\0\u18db\0\u191a\0\u1959"+
    "\0\u1998\0\u19d7\0\u0333\0\u0333\0\u1a16\0\u1a55\0\u1a94\0\u1ad3"+
    "\0\u1b12\0\u1b51\0\u1b90\0\u1bcf\0\u1c0e\0\u1c4d\0\u1c8c\0\u1ccb"+
    "\0\u1d0a\0\u1d49\0\u1d88\0\u1dc7\0\u1e06\0\u1b90\0\u1e45\0\u1e84"+
    "\0\u1ec3\0\u1f02\0\u1f41\0\u1f80\0\u1d88\0\u1fbf\0\u1ffe\0\u203d"+
    "\0\u207c\0\u20bb\0\u0333\0\u20fa\0\u0333\0\u0333\0\u2139";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\13\2\14\1\15\1\14\1\16\1\17\1\20\1\21"+
    "\1\22\5\17\1\23\1\24\1\25\2\17\1\26\1\27"+
    "\1\16\1\17\1\30\4\17\1\31\1\17\1\32\1\33"+
    "\1\17\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\17\1\56\1\57\1\60\1\61"+
    "\1\62\1\63\1\64\1\32\1\65\1\66\1\13\2\14"+
    "\1\15\1\14\1\67\1\70\1\20\1\21\1\67\5\70"+
    "\1\71\6\70\1\67\14\70\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\2\70\1\56\1\57\1\60"+
    "\1\61\1\62\1\70\1\64\1\70\1\65\1\66\1\13"+
    "\2\14\1\15\1\14\1\72\1\73\1\20\1\21\1\72"+
    "\5\73\1\71\6\73\1\72\14\73\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\2\73\1\56\1\57"+
    "\1\60\1\61\1\62\1\73\1\64\1\73\1\65\1\66"+
    "\1\13\2\14\1\15\1\14\1\74\1\75\1\20\1\21"+
    "\1\74\5\75\1\71\6\75\1\74\14\75\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\2\75\1\56"+
    "\1\57\1\60\1\61\1\62\1\75\1\64\1\75\1\65"+
    "\1\66\1\13\2\14\1\15\1\14\1\76\1\77\1\20"+
    "\1\21\1\76\5\77\1\71\6\77\1\76\14\77\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\2\77"+
    "\1\56\1\57\1\60\1\61\1\62\1\77\1\64\1\77"+
    "\1\65\1\66\1\13\2\14\1\15\1\14\1\100\1\101"+
    "\1\20\1\21\1\100\5\101\1\71\6\101\1\100\14\101"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\2\101\1\56\1\57\1\60\1\61\1\62\1\101\1\64"+
    "\1\101\1\65\1\66\1\13\2\14\1\15\1\14\1\102"+
    "\1\103\1\20\1\21\1\102\5\103\1\71\6\103\1\102"+
    "\14\103\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\2\103\1\56\1\57\1\60\1\61\1\62\1\103"+
    "\1\64\1\103\1\65\1\66\1\10\1\104\2\10\1\105"+
    "\72\10\1\106\1\107\2\106\1\110\12\106\1\111\57\106"+
    "\1\13\2\14\1\15\1\14\1\16\1\17\1\20\1\21"+
    "\1\16\5\17\1\71\1\17\1\25\2\17\1\26\1\27"+
    "\1\16\6\17\1\31\1\17\1\32\1\112\2\17\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\2\17"+
    "\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\32"+
    "\1\65\1\66\100\0\2\14\1\0\1\14\77\0\1\16"+
    "\1\17\2\0\1\16\5\17\1\0\6\17\1\16\14\17"+
    "\1\113\1\114\5\0\1\115\10\0\2\17\5\0\1\17"+
    "\1\0\1\17\7\0\2\17\2\0\6\17\1\0\23\17"+
    "\1\113\1\114\16\0\2\17\5\0\1\17\1\0\1\17"+
    "\2\0\7\116\1\117\67\116\10\120\1\121\66\120\5\0"+
    "\1\16\1\17\2\0\1\122\5\17\1\0\6\17\1\16"+
    "\14\17\1\113\1\114\5\0\1\115\10\0\2\17\5\0"+
    "\1\17\1\0\1\17\21\0\1\61\1\123\1\124\1\0"+
    "\1\125\1\126\4\0\1\127\2\0\1\130\4\0\1\131"+
    "\3\0\1\54\21\0\1\61\14\0\2\17\2\0\6\17"+
    "\1\0\5\17\1\132\15\17\1\113\1\114\16\0\2\17"+
    "\5\0\1\17\1\0\1\17\7\0\2\17\2\0\6\17"+
    "\1\0\10\17\1\133\12\17\1\113\1\114\16\0\2\17"+
    "\5\0\1\17\1\0\1\17\7\0\2\17\2\0\6\17"+
    "\1\0\23\17\1\113\1\114\16\0\1\17\1\133\5\0"+
    "\1\17\1\0\1\17\7\0\2\17\2\0\6\17\1\0"+
    "\20\17\1\134\2\17\1\113\1\114\16\0\2\17\5\0"+
    "\1\17\1\0\1\17\7\0\2\17\2\0\6\17\1\0"+
    "\4\17\1\135\16\17\1\113\1\114\16\0\2\17\5\0"+
    "\1\17\1\0\1\17\7\0\2\17\2\0\6\17\1\0"+
    "\13\17\1\136\7\17\1\113\1\114\16\0\2\17\5\0"+
    "\1\17\1\0\1\17\7\0\2\17\2\0\6\17\1\0"+
    "\4\17\1\133\5\17\1\133\10\17\1\113\1\114\16\0"+
    "\2\17\5\0\1\17\1\0\1\17\7\0\2\17\2\0"+
    "\6\17\1\0\1\17\1\137\2\17\1\133\16\17\1\113"+
    "\1\114\16\0\2\17\5\0\1\17\1\0\1\17\7\0"+
    "\2\17\2\0\6\17\1\0\23\17\1\113\1\114\16\0"+
    "\1\140\1\17\5\0\1\17\1\0\1\17\45\0\1\141"+
    "\40\0\1\142\3\0\1\142\5\0\1\61\6\0\1\142"+
    "\15\0\1\61\1\143\50\0\1\61\25\0\1\61\36\0"+
    "\2\144\2\0\6\144\1\0\23\144\3\0\1\145\14\0"+
    "\2\144\5\0\1\144\1\0\1\144\7\0\2\146\2\0"+
    "\6\146\1\0\23\146\3\0\1\147\14\0\2\146\5\0"+
    "\1\146\1\0\1\146\7\0\2\150\2\0\6\150\1\0"+
    "\23\150\3\0\1\151\14\0\2\150\5\0\1\150\1\0"+
    "\1\150\7\0\2\152\2\0\6\152\1\61\23\152\3\0"+
    "\1\153\2\0\1\61\11\0\2\152\5\0\1\152\1\0"+
    "\1\152\54\0\1\154\24\0\4\45\1\155\72\45\5\0"+
    "\2\17\2\0\6\17\1\0\22\17\1\156\1\113\1\114"+
    "\16\0\2\17\5\0\1\17\1\0\1\17\21\0\1\61"+
    "\45\0\1\61\30\0\1\61\47\0\1\61\76\0\1\61"+
    "\100\0\1\61\12\0\2\17\2\0\6\17\1\0\1\17"+
    "\1\25\21\17\1\113\1\114\16\0\2\17\5\0\1\17"+
    "\1\0\1\17\21\0\1\157\53\0\1\61\100\0\1\61"+
    "\77\0\1\61\5\0\1\67\1\70\2\0\1\67\5\70"+
    "\1\0\6\70\1\67\14\70\1\160\1\114\5\0\1\115"+
    "\10\0\2\70\5\0\1\70\1\0\1\70\7\0\2\70"+
    "\2\0\6\70\1\0\23\70\1\160\1\114\16\0\2\70"+
    "\5\0\1\70\1\0\1\70\21\0\1\61\25\0\1\54"+
    "\21\0\1\61\14\0\1\72\1\73\2\0\1\72\5\73"+
    "\1\0\6\73\1\72\14\73\1\113\1\114\5\0\1\115"+
    "\10\0\2\73\5\0\1\73\1\0\1\73\7\0\2\73"+
    "\2\0\6\73\1\0\23\73\1\113\1\114\16\0\2\73"+
    "\5\0\1\73\1\0\1\73\7\0\1\74\1\75\2\0"+
    "\1\74\5\75\1\0\6\75\1\74\14\75\1\161\1\114"+
    "\5\0\1\115\10\0\2\75\5\0\1\75\1\0\1\75"+
    "\7\0\2\75\2\0\6\75\1\0\23\75\1\161\1\114"+
    "\16\0\2\75\5\0\1\75\1\0\1\75\7\0\1\76"+
    "\1\77\2\0\1\76\5\77\1\0\6\77\1\76\14\77"+
    "\1\113\1\114\5\0\1\115\10\0\2\77\5\0\1\77"+
    "\1\0\1\77\7\0\2\77\2\0\6\77\1\0\23\77"+
    "\1\113\1\114\16\0\2\77\5\0\1\77\1\0\1\77"+
    "\7\0\1\100\1\101\2\0\1\100\5\101\1\0\6\101"+
    "\1\100\14\101\1\113\1\114\5\0\1\115\10\0\2\101"+
    "\5\0\1\101\1\0\1\101\7\0\2\101\2\0\6\101"+
    "\1\0\23\101\1\113\1\114\16\0\2\101\5\0\1\101"+
    "\1\0\1\101\7\0\1\102\1\103\2\0\1\102\5\103"+
    "\1\0\6\103\1\102\14\103\1\113\1\114\5\0\1\115"+
    "\10\0\2\103\5\0\1\103\1\0\1\103\7\0\2\103"+
    "\2\0\6\103\1\0\23\103\1\113\1\114\16\0\2\103"+
    "\5\0\1\103\1\0\1\103\3\0\1\105\2\0\1\105"+
    "\72\0\1\106\1\107\2\106\1\110\72\106\1\0\1\110"+
    "\2\0\1\110\72\0\1\106\1\107\2\106\1\110\30\106"+
    "\1\162\41\106\5\0\2\17\2\0\6\17\1\0\1\17"+
    "\1\163\2\17\1\133\16\17\1\113\1\114\16\0\2\17"+
    "\5\0\1\17\1\0\1\17\45\0\1\164\100\0\1\165"+
    "\36\0\1\166\3\0\1\166\14\0\1\166\55\0\1\16"+
    "\1\17\2\0\1\16\1\167\1\17\1\170\2\17\1\0"+
    "\6\17\1\16\14\17\1\113\1\114\5\0\1\115\10\0"+
    "\2\17\5\0\1\17\1\0\1\17\23\0\1\171\104\0"+
    "\1\172\73\0\1\173\112\0\1\174\70\0\1\175\70\0"+
    "\1\176\1\177\72\0\1\200\62\0\2\17\2\0\6\17"+
    "\1\0\15\17\1\201\5\17\1\113\1\114\16\0\2\17"+
    "\5\0\1\17\1\0\1\17\7\0\2\17\2\0\6\17"+
    "\1\0\2\17\1\133\20\17\1\113\1\114\16\0\2\17"+
    "\5\0\1\17\1\0\1\17\7\0\2\17\2\0\6\17"+
    "\1\0\23\17\1\113\1\114\16\0\1\17\1\202\5\0"+
    "\1\17\1\0\1\17\7\0\2\17\2\0\6\17\1\0"+
    "\1\133\22\17\1\113\1\114\16\0\2\17\5\0\1\17"+
    "\1\0\1\17\7\0\2\17\2\0\6\17\1\0\12\17"+
    "\1\133\10\17\1\113\1\114\16\0\2\17\5\0\1\17"+
    "\1\0\1\17\7\0\2\17\2\0\6\17\1\0\4\17"+
    "\1\203\16\17\1\113\1\114\16\0\2\17\5\0\1\17"+
    "\1\0\1\17\7\0\1\142\3\0\1\142\14\0\1\142"+
    "\23\0\1\115\31\0\2\144\2\0\6\144\1\0\23\144"+
    "\20\0\2\144\5\0\1\144\1\0\1\144\7\0\2\146"+
    "\2\0\6\146\1\0\23\146\20\0\2\146\5\0\1\146"+
    "\1\0\1\146\7\0\2\150\2\0\6\150\1\0\23\150"+
    "\20\0\2\150\5\0\1\150\1\0\1\150\7\0\2\152"+
    "\2\0\6\152\1\0\23\152\20\0\2\152\5\0\1\152"+
    "\1\0\1\152\7\0\2\152\2\0\6\152\1\0\23\152"+
    "\3\0\1\153\14\0\2\152\5\0\1\152\1\0\1\152"+
    "\54\0\1\61\25\0\1\155\2\0\1\155\77\0\2\17"+
    "\2\0\6\17\1\0\14\17\1\204\6\17\1\113\1\114"+
    "\16\0\2\17\5\0\1\17\1\0\1\17\47\0\1\61"+
    "\74\0\1\205\76\0\1\206\33\0\1\106\1\107\2\106"+
    "\1\110\35\106\1\207\34\106\5\0\2\210\2\0\6\210"+
    "\1\0\23\210\20\0\2\210\5\0\1\210\1\0\1\210"+
    "\7\0\2\17\2\0\2\17\1\211\3\17\1\0\23\17"+
    "\1\113\1\114\16\0\2\17\5\0\1\17\1\0\1\17"+
    "\7\0\2\17\2\0\4\17\1\212\1\17\1\0\23\17"+
    "\1\113\1\114\16\0\2\17\5\0\1\17\1\0\1\17"+
    "\24\0\1\213\100\0\1\200\77\0\1\214\73\0\1\213"+
    "\12\0\1\215\65\0\1\216\111\0\1\217\74\0\1\220"+
    "\71\0\1\213\53\0\2\17\2\0\6\17\1\0\16\17"+
    "\1\221\4\17\1\113\1\114\16\0\2\17\5\0\1\17"+
    "\1\0\1\17\7\0\2\17\2\0\6\17\1\0\22\17"+
    "\1\222\1\113\1\114\16\0\2\17\5\0\1\17\1\0"+
    "\1\17\7\0\2\70\2\0\6\70\1\0\23\70\20\0"+
    "\2\70\5\0\1\70\1\0\1\70\7\0\2\75\2\0"+
    "\6\75\1\0\23\75\20\0\2\75\5\0\1\75\1\0"+
    "\1\75\2\0\1\106\1\107\2\106\1\110\25\106\1\223"+
    "\44\106\5\0\2\210\2\0\6\210\1\0\23\210\1\113"+
    "\1\114\16\0\2\210\5\0\1\210\1\0\1\210\7\0"+
    "\2\17\2\0\3\17\1\224\2\17\1\0\23\17\1\113"+
    "\1\114\16\0\2\17\5\0\1\17\1\0\1\17\7\0"+
    "\2\17\2\0\5\17\1\225\1\0\23\17\1\113\1\114"+
    "\16\0\2\17\5\0\1\17\1\0\1\17\2\0\1\213"+
    "\1\226\2\213\1\227\72\213\22\0\1\230\75\0\1\231"+
    "\110\0\1\213\74\0\1\232\103\0\1\213\45\0\2\17"+
    "\2\0\6\17\1\0\5\17\1\233\15\17\1\113\1\114"+
    "\16\0\2\17\5\0\1\17\1\0\1\17\7\0\2\17"+
    "\2\0\6\17\1\0\11\17\1\234\11\17\1\113\1\114"+
    "\16\0\2\17\5\0\1\17\1\0\1\17\2\0\1\223"+
    "\1\235\2\223\1\236\72\223\5\0\2\17\2\0\1\237"+
    "\5\17\1\0\23\17\1\113\1\114\16\0\2\17\5\0"+
    "\1\17\1\0\1\17\7\0\2\17\2\0\4\17\1\224"+
    "\1\17\1\0\23\17\1\113\1\114\16\0\2\17\5\0"+
    "\1\17\1\0\1\17\3\0\1\227\2\0\1\227\120\0"+
    "\1\213\72\0\1\240\114\0\1\213\43\0\2\17\2\0"+
    "\6\17\1\0\17\17\1\241\3\17\1\113\1\114\16\0"+
    "\2\17\5\0\1\17\1\0\1\17\7\0\2\17\2\0"+
    "\6\17\1\0\10\17\1\242\12\17\1\113\1\114\16\0"+
    "\2\17\5\0\1\17\1\0\1\17\3\0\1\236\2\0"+
    "\1\236\77\0\2\17\2\0\1\243\5\17\1\0\23\17"+
    "\1\113\1\114\16\0\2\17\5\0\1\17\1\0\1\17"+
    "\33\0\1\244\52\0\2\17\2\0\6\17\1\0\4\17"+
    "\1\245\16\17\1\113\1\114\16\0\2\17\5\0\1\17"+
    "\1\0\1\17\7\0\2\17\2\0\6\17\1\0\4\17"+
    "\1\246\16\17\1\113\1\114\16\0\2\17\5\0\1\17"+
    "\1\0\1\17\42\0\1\247\75\0\1\213\37\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8568];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\12\0\1\11\1\1\1\11\30\1\7\11\4\1\1\11"+
    "\24\1\1\0\2\1\1\0\1\1\4\0\1\11\1\0"+
    "\1\11\1\1\7\0\7\1\1\11\1\1\1\11\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\4\1"+
    "\3\0\2\1\1\11\3\1\10\0\6\1\2\0\2\1"+
    "\6\0\2\1\1\0\4\1\3\0\5\1\1\0\3\1"+
    "\1\0\2\1\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[167];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
	protected int dataBlockStart = 0;

	protected void StartDataBlock()
	{
		dataBlockStart = zzStartRead;
        yybegin(LEX_EOF);
	}

	protected int podBlockStart = 0;

	protected void StartPodBlock()
	{
		podBlockStart = zzStartRead;
        yybegin(LEX_POD);
	}


  public PerlLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public PerlLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 162) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { return PERL_BAD_CHARACTER;
          }
        case 40: break;
        case 4: 
          { return PERL_NUMBER;
          }
        case 41: break;
        case 34: 
          { yybegin(FUNCTION_DEFINITION); return PerlFunction.getFunction(yytext().toString());
          }
        case 42: break;
        case 36: 
          { zzCurrentPos = zzStartRead = podBlockStart;
        yybegin(YYINITIAL);
        return PERL_POD;
          }
        case 43: break;
        case 5: 
          { return PerlFunction.getFunction(yytext().toString());
          }
        case 44: break;
        case 6: 
          { return PERL_OPERATOR;
          }
        case 45: break;
        case 2: 
          { return TokenType.WHITE_SPACE;
          }
        case 46: break;
        case 29: 
          { return checkBuiltInHash();
          }
        case 47: break;
        case 14: 
          { return PERL_COMMA;
          }
        case 48: break;
        case 27: 
          { return checkBuiltInScalar();
          }
        case 49: break;
        case 38: 
          { yybegin(PACKAGE_DEFINITION); return PerlFunction.getFunction(yytext().toString());
          }
        case 50: break;
        case 28: 
          { return checkBuiltInArray();
          }
        case 51: break;
        case 32: 
          { yybegin(PACKAGE_INSTANCE_CALL);
    yypushback(2);
    return PERL_PACKAGE;
          }
        case 52: break;
        case 31: 
          { yybegin(PACKAGE_STATIC_CALL);
    yypushback(2);
    return PERL_PACKAGE;
          }
        case 53: break;
        case 33: 
          { yybegin(PACKAGE_USE);return PerlFunction.getFunction(yytext().toString());
          }
        case 54: break;
        case 25: 
          { return PERL_DEPACKAGE;
          }
        case 55: break;
        case 35: 
          { StartPodBlock();break;
          }
        case 56: break;
        case 7: 
          { return PERL_COMMENT;
          }
        case 57: break;
        case 23: 
          { return PERL_DQ_STRING;
          }
        case 58: break;
        case 16: 
          { yybegin(YYINITIAL);return PERL_USER_FUNCTION;
          }
        case 59: break;
        case 30: 
          { return checkBuiltInGlob();
          }
        case 60: break;
        case 18: 
          { return PERL_SQ_STRING;
          }
        case 61: break;
        case 12: 
          { return PERL_LPAREN;
          }
        case 62: break;
        case 19: 
          { return PERL_STATIC_METHOD_CALL;
          }
        case 63: break;
        case 24: 
          { yybegin(PACKAGE_USE); return PerlFunction.getFunction(yytext().toString());
          }
        case 64: break;
        case 13: 
          { return PERL_RPAREN;
          }
        case 65: break;
        case 39: 
          { yybegin(LEX_REQUIRE);return PerlFunction.getFunction(yytext().toString());
          }
        case 66: break;
        case 26: 
          { yybegin(LEX_DEREFERENCE);return PERL_DEREFERENCE;
          }
        case 67: break;
        case 3: 
          { yybegin(YYINITIAL);return PERL_SEMI;
          }
        case 68: break;
        case 20: 
          { return PERL_INSTANCE_METHOD_CALL;
          }
        case 69: break;
        case 22: 
          { if( zzMarkedPos == zzEndRead )
        {
            zzCurrentPos = zzStartRead = podBlockStart;
            return PERL_POD;
        }
        break;
          }
        case 70: break;
        case 15: 
          { return PERL_PACKAGE;
          }
        case 71: break;
        case 21: 
          { if( zzMarkedPos == zzEndRead )
        {
            zzCurrentPos = zzStartRead = dataBlockStart;
            return PERL_COMMENT_MULTILINE;
        }
        break;
          }
        case 72: break;
        case 8: 
          { return PERL_LBRACE;
          }
        case 73: break;
        case 9: 
          { return PERL_RBRACE;
          }
        case 74: break;
        case 37: 
          { StartDataBlock(); break;
          }
        case 75: break;
        case 17: 
          { yybegin(PACKAGE_USE_PARAMS);
        return checkCorePackage();
          }
        case 76: break;
        case 11: 
          { return PERL_RBRACK;
          }
        case 77: break;
        case 10: 
          { return PERL_LBRACK;
          }
        case 78: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
