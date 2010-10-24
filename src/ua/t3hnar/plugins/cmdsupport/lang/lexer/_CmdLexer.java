/*
 * Copyright 2010 Yaroslav Klymko aka t3hnar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* The following code was generated by JFlex 1.4.3 on 24.10.10 14:11 */

package ua.t3hnar.plugins.cmdsupport.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 24.10.10 14:11 from the specification file
 * <tt>src/ua/t3hnar/plugins/cmdsupport/lang/lexer/Cmd.flex</tt>
 */
final class _CmdLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ECHO = 6;
  public static final int GOTO = 14;
  public static final int CALL = 4;
  public static final int IF_DIGIT = 20;
  public static final int IF_EQUAL = 24;
  public static final int REM = 26;
  public static final int SET_VALUE = 30;
  public static final int ECHO_SYM = 8;
  public static final int IF = 16;
  public static final int IF_VARIABLE = 22;
  public static final int IF_EXIST = 18;
  public static final int SET = 28;
  public static final int FOR_IN = 12;
  public static final int NEXT_SYM = 2;
  public static final int COMMAND = 32;
  public static final int FOR = 10;
  public static final int YYINITIAL = 0;
  public static final int LABEL = 34;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 
    16, 16, 17, 17
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\3\1\0\1\6\1\2\22\0\1\1\1\0\1\4"+
    "\3\0\1\10\1\0\1\37\1\40\2\0\1\6\2\0\1\33\12\44"+
    "\1\15\1\6\1\11\1\43\1\12\1\34\1\14\1\17\1\0\1\16"+
    "\1\36\1\24\1\26\1\21\1\25\1\30\2\0\1\20\1\32\1\35"+
    "\1\22\2\0\1\27\1\31\1\23\1\0\1\42\1\0\1\41\3\0"+
    "\1\5\1\0\1\13\2\0\1\17\1\0\1\16\1\36\1\24\1\26"+
    "\1\21\1\25\1\30\2\0\1\20\1\32\1\35\1\22\2\0\1\27"+
    "\1\31\1\23\1\0\1\42\1\0\1\41\3\0\1\7\u05e3\0\12\44"+
    "\206\0\12\44\u026c\0\12\44\166\0\12\44\166\0\12\44\166\0\12\44"+
    "\166\0\12\44\167\0\11\44\166\0\12\44\166\0\12\44\166\0\12\44"+
    "\340\0\12\44\166\0\12\44\106\0\12\44\u0116\0\12\44\u031f\0\11\44"+
    "\u046e\0\12\44\46\0\12\44\u012c\0\12\44\ue5c0\0\12\44\346\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\22\0\1\1\2\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\2\1\1\10\1\11\1\1\1\12\4\13\1\1"+
    "\1\14\1\15\1\14\1\16\1\14\1\16\1\17\1\20"+
    "\4\17\1\21\1\22\1\23\2\22\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\2\32\1\30\1\33\1\34\6\33"+
    "\1\13\1\35\1\13\1\36\1\13\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\13\1\45\1\46\1\47\1\50"+
    "\1\47\1\51\1\52\1\53\1\52\1\54\1\55\12\54"+
    "\1\56\1\57\1\60\1\0\1\1\1\61\1\62\1\6"+
    "\1\7\1\63\1\64\1\0\1\1\1\13\1\0\1\65"+
    "\2\14\1\66\1\0\2\17\1\67\1\70\1\71\1\72"+
    "\1\0\1\73\6\0\1\74\1\0\1\75\1\13\2\76"+
    "\1\77\1\13\2\0\1\100\1\101\2\0\1\102\2\0"+
    "\1\103\7\54\1\104\1\54\1\77\1\0\1\105\1\0"+
    "\1\65\1\0\1\65\1\0\1\106\1\73\3\0\1\107"+
    "\1\0\1\75\1\0\1\75\1\77\1\100\1\101\1\102"+
    "\1\103\1\0\1\103\4\54\1\110\1\60\1\111\1\77"+
    "\1\105\1\65\1\17\4\0\1\75\1\103\1\112\1\113"+
    "\1\114\1\115\2\0\1\116\6\0\1\117\5\0\1\120"+
    "\2\0\1\121";

  private static int [] zzUnpackAction() {
    int [] result = new int[231];
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
    "\0\0\0\45\0\112\0\157\0\224\0\271\0\336\0\u0103"+
    "\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\u01e1\0\u0206\0\u022b"+
    "\0\u0250\0\u0275\0\u029a\0\u02bf\0\u02e4\0\u0309\0\u032e\0\u0353"+
    "\0\u0378\0\u039d\0\u03c2\0\u03e7\0\u040c\0\u0431\0\u0456\0\u047b"+
    "\0\u032e\0\u04a0\0\u04c5\0\u04ea\0\u050f\0\u0534\0\u0559\0\u057e"+
    "\0\u05a3\0\u032e\0\u05c8\0\u05ed\0\u0612\0\u0637\0\u065c\0\u032e"+
    "\0\u0681\0\u06a6\0\u06cb\0\u032e\0\u06f0\0\u0715\0\u073a\0\u032e"+
    "\0\u075f\0\u032e\0\u032e\0\u0784\0\u07a9\0\u032e\0\u0784\0\u07ce"+
    "\0\u032e\0\u07f3\0\u0818\0\u083d\0\u0862\0\u0887\0\u08ac\0\u08d1"+
    "\0\u08f6\0\u091b\0\u0940\0\u032e\0\u0965\0\u032e\0\u098a\0\u09af"+
    "\0\u032e\0\u09d4\0\u09f9\0\u0a1e\0\u032e\0\u032e\0\u0a43\0\u0a68"+
    "\0\u032e\0\u0a8d\0\u032e\0\u0ab2\0\u0ad7\0\u0afc\0\u0b21\0\u0b46"+
    "\0\u032e\0\u0b6b\0\u0b90\0\u0bb5\0\u0bda\0\u0bff\0\u0c24\0\u0c49"+
    "\0\u0c6e\0\u0c93\0\u0cb8\0\u032e\0\u0cdd\0\u0d02\0\u032e\0\u032e"+
    "\0\u032e\0\u032e\0\u032e\0\u040c\0\u0d27\0\u0d4c\0\u032e\0\u0d71"+
    "\0\u0559\0\u0d96\0\u032e\0\u05ed\0\u0dbb\0\u0de0\0\u0e05\0\u0612"+
    "\0\u032e\0\u032e\0\u0784\0\u0818\0\u032e\0\u0e2a\0\u0e4f\0\u0e74"+
    "\0\u0e99\0\u0ebe\0\u0ee3\0\u032e\0\u0f08\0\u08f6\0\u0f2d\0\u08f6"+
    "\0\u032e\0\u08f6\0\u0f52\0\u0a43\0\u0f77\0\u0a43\0\u0f9c\0\u0fc1"+
    "\0\u0ad7\0\u032e\0\u0fe6\0\u100b\0\u0afc\0\u1030\0\u1055\0\u107a"+
    "\0\u109f\0\u10c4\0\u10e9\0\u110e\0\u0afc\0\u1133\0\u032e\0\u1158"+
    "\0\u032e\0\u117d\0\u032e\0\u11a2\0\u05a3\0\u11c7\0\u0612\0\u0818"+
    "\0\u11ec\0\u1211\0\u1236\0\u032e\0\u125b\0\u032e\0\u1280\0\u0940"+
    "\0\u0a1e\0\u032e\0\u12a5\0\u0ad7\0\u032e\0\u12ca\0\u0b46\0\u12ef"+
    "\0\u1314\0\u1339\0\u135e\0\u0afc\0\u0afc\0\u0afc\0\u0cdd\0\u0d27"+
    "\0\u0d71\0\u0dbb\0\u1383\0\u13a8\0\u13cd\0\u13f2\0\u0f08\0\u100b"+
    "\0\u0afc\0\u0afc\0\u0afc\0\u0afc\0\u1417\0\u143c\0\u032e\0\u1461"+
    "\0\u1486\0\u14ab\0\u14d0\0\u14f5\0\u151a\0\u032e\0\u153f\0\u1564"+
    "\0\u1589\0\u15ae\0\u15d3\0\u032e\0\u15f8\0\u161d\0\u032e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[231];
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
    "\1\23\1\24\2\25\1\26\1\23\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\30\23\1\37\2\25"+
    "\1\40\1\23\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\23\1\41\27\23\1\47\1\50\2\25\1\51\1\47"+
    "\1\52\1\42\1\43\1\44\1\45\1\53\1\47\1\54"+
    "\27\47\1\55\1\56\2\25\1\57\1\55\1\60\1\42"+
    "\1\43\1\44\1\45\1\61\1\55\1\60\4\55\1\62"+
    "\23\55\1\63\2\25\1\57\1\55\1\60\1\42\1\43"+
    "\1\44\1\45\1\61\1\55\1\60\27\55\1\64\1\65"+
    "\2\25\24\64\1\66\5\64\1\67\6\64\1\70\1\71"+
    "\2\25\33\70\1\72\1\73\4\70\1\74\1\75\2\25"+
    "\2\74\1\76\1\42\1\43\1\44\1\45\2\74\1\77"+
    "\15\74\1\100\11\74\1\101\1\102\2\25\1\103\11\101"+
    "\1\104\5\101\1\105\10\101\1\106\1\107\4\101\1\110"+
    "\1\101\1\111\1\112\2\25\1\113\1\111\5\114\1\115"+
    "\1\111\1\114\27\111\1\116\1\117\2\25\40\116\1\120"+
    "\1\121\1\122\2\25\41\121\1\111\1\123\2\25\1\124"+
    "\1\111\5\125\2\111\1\125\27\111\2\126\2\25\41\126"+
    "\1\127\1\130\2\25\2\127\5\131\2\127\1\131\25\127"+
    "\1\132\1\127\1\133\1\134\2\25\1\135\40\133\1\136"+
    "\1\137\2\25\1\140\1\136\1\141\1\42\1\43\1\44"+
    "\1\45\1\142\1\136\1\141\1\143\2\136\1\144\2\136"+
    "\1\145\1\136\1\146\1\147\1\150\1\151\13\136\1\152"+
    "\1\153\1\154\1\0\2\152\5\154\2\152\1\154\27\152"+
    "\1\23\3\0\2\23\5\0\2\23\1\0\27\23\1\0"+
    "\1\24\45\0\2\25\41\0\1\26\1\155\2\0\1\23"+
    "\1\156\5\155\2\26\1\155\27\26\54\0\1\157\45\0"+
    "\1\160\45\0\1\161\45\0\1\162\32\0\1\23\2\163"+
    "\1\0\2\23\5\163\2\23\1\163\27\23\1\164\3\0"+
    "\2\164\5\0\2\164\1\0\27\164\15\0\1\154\30\0"+
    "\1\37\43\0\1\40\1\165\2\0\1\23\1\166\5\165"+
    "\2\40\1\165\27\40\7\0\1\167\45\0\1\167\45\0"+
    "\1\167\45\0\1\167\32\0\1\23\2\41\1\0\2\23"+
    "\5\41\2\23\1\41\27\23\1\47\3\0\2\47\5\0"+
    "\2\47\1\0\27\47\1\0\1\50\43\0\1\51\1\170"+
    "\2\0\1\171\1\172\5\170\2\51\1\170\27\51\1\47"+
    "\2\173\1\0\2\47\5\173\2\47\1\173\27\47\1\174"+
    "\3\0\2\174\5\0\2\174\1\0\27\174\1\55\3\0"+
    "\2\55\5\0\2\55\1\0\27\55\1\0\1\56\43\0"+
    "\1\57\1\175\2\0\1\55\1\176\5\175\2\57\1\175"+
    "\27\57\1\55\2\60\1\0\2\55\5\60\2\55\1\60"+
    "\30\55\3\0\2\55\5\0\2\55\1\0\10\55\1\177"+
    "\6\55\1\200\7\55\1\0\1\63\44\0\1\65\100\0"+
    "\1\201\31\0\1\202\23\0\1\71\43\0\1\74\3\0"+
    "\2\74\5\0\2\74\1\0\27\74\1\0\1\75\43\0"+
    "\1\74\3\0\2\74\5\0\2\74\1\0\16\74\1\203"+
    "\10\74\1\0\1\102\43\0\2\204\2\0\1\205\1\206"+
    "\37\204\32\0\1\207\41\0\1\210\11\0\1\211\25\0"+
    "\1\212\46\0\1\213\63\0\1\214\1\0\1\111\3\0"+
    "\2\111\5\0\2\111\1\0\27\111\1\0\1\112\43\0"+
    "\1\113\1\215\2\0\1\216\1\217\5\215\2\113\1\215"+
    "\27\113\1\220\2\221\1\0\2\220\5\221\2\220\1\221"+
    "\27\220\1\0\1\117\107\0\1\120\1\0\1\122\44\0"+
    "\1\123\43\0\1\124\1\155\2\0\1\222\1\223\5\155"+
    "\2\124\1\155\27\124\1\224\1\225\2\0\2\224\5\0"+
    "\2\224\1\0\25\224\1\226\1\224\1\0\1\130\43\0"+
    "\1\227\1\230\2\0\2\227\5\0\2\227\1\0\27\227"+
    "\1\0\1\134\43\0\2\231\2\0\1\232\1\233\37\231"+
    "\1\136\3\0\2\136\5\0\2\136\1\0\27\136\1\0"+
    "\1\137\43\0\1\140\1\234\2\0\1\235\1\236\5\234"+
    "\2\140\1\234\27\140\1\136\2\141\1\0\2\136\5\141"+
    "\2\136\1\141\30\136\3\0\2\136\5\0\2\136\1\0"+
    "\1\136\1\237\26\136\3\0\2\136\5\0\2\136\1\0"+
    "\4\136\1\240\23\136\3\0\2\136\5\0\2\136\1\0"+
    "\1\241\1\136\1\242\25\136\3\0\2\136\5\0\2\136"+
    "\1\0\4\136\1\243\23\136\3\0\2\136\5\0\2\136"+
    "\1\0\6\136\1\244\21\136\3\0\2\136\5\0\2\136"+
    "\1\0\10\136\1\245\17\136\3\0\2\136\5\0\2\136"+
    "\1\0\6\136\1\246\20\136\1\152\3\0\2\152\5\0"+
    "\2\152\1\0\27\152\1\0\1\153\43\0\2\155\2\0"+
    "\1\247\1\250\37\155\1\26\1\155\2\0\1\26\1\156"+
    "\5\155\2\26\1\155\27\26\2\165\2\0\1\251\1\252"+
    "\37\165\1\40\1\165\2\0\1\40\1\166\5\165\2\40"+
    "\1\165\27\40\2\170\2\0\1\253\1\254\37\170\1\51"+
    "\1\170\2\0\1\255\1\172\5\170\2\51\1\170\27\51"+
    "\2\175\2\0\1\60\1\256\37\175\1\57\1\175\2\0"+
    "\1\57\1\176\5\175\2\57\1\175\27\57\1\55\3\0"+
    "\2\55\5\0\2\55\1\0\10\55\1\257\16\55\2\204"+
    "\2\0\1\260\1\206\37\204\36\0\1\261\35\0\1\262"+
    "\45\0\1\263\37\0\1\264\47\0\1\265\16\0\2\215"+
    "\2\0\1\266\1\267\37\215\1\113\1\215\2\0\1\270"+
    "\1\217\5\215\2\113\1\215\27\113\1\124\1\155\2\0"+
    "\1\271\1\223\5\155\2\124\1\155\27\124\1\0\1\225"+
    "\41\0\1\272\1\0\1\227\1\225\2\0\2\227\5\0"+
    "\2\227\1\0\27\227\1\273\1\230\2\0\2\273\5\0"+
    "\2\273\1\0\27\273\2\231\2\0\1\274\1\233\37\231"+
    "\2\234\2\0\1\275\1\276\37\234\1\140\1\234\2\0"+
    "\1\277\1\236\5\234\2\140\1\234\27\140\1\136\3\0"+
    "\2\136\5\0\2\136\1\0\2\136\1\300\25\136\3\0"+
    "\2\136\5\0\2\136\1\0\5\136\1\301\22\136\3\0"+
    "\2\136\5\0\2\136\1\0\7\136\1\302\20\136\3\0"+
    "\2\136\5\0\2\136\1\0\13\136\1\303\14\136\3\0"+
    "\2\136\5\0\2\136\1\0\11\136\1\304\16\136\3\0"+
    "\2\136\5\0\2\136\1\0\14\136\1\305\13\136\3\0"+
    "\2\136\5\0\2\136\1\0\5\136\1\306\21\136\2\155"+
    "\2\0\1\307\1\250\37\155\2\165\2\0\1\310\1\252"+
    "\37\165\2\170\2\0\1\311\1\254\37\170\2\175\2\0"+
    "\1\312\1\256\37\175\24\0\1\313\42\0\1\314\53\0"+
    "\1\315\43\0\1\316\14\0\2\215\2\0\1\317\1\267"+
    "\37\215\1\273\3\0\2\273\5\0\2\273\1\0\27\273"+
    "\2\234\2\0\1\320\1\276\37\234\1\136\3\0\2\136"+
    "\5\0\2\136\1\0\2\136\1\321\25\136\3\0\2\136"+
    "\5\0\2\136\1\0\4\136\1\322\23\136\3\0\2\136"+
    "\5\0\2\136\1\0\4\136\1\323\23\136\3\0\2\136"+
    "\5\0\2\136\1\0\6\136\1\324\20\136\41\0\1\325"+
    "\32\0\1\326\40\0\1\327\56\0\1\330\32\0\1\331"+
    "\41\0\1\332\50\0\1\333\62\0\1\334\26\0\1\335"+
    "\56\0\1\336\32\0\1\337\62\0\1\340\31\0\1\341"+
    "\41\0\1\342\51\0\1\343\33\0\1\344\54\0\1\345"+
    "\36\0\1\346\57\0\1\347\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5698];
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
    "\22\0\4\1\1\11\11\1\1\11\10\1\1\11\5\1"+
    "\1\11\3\1\1\11\3\1\1\11\1\1\2\11\2\1"+
    "\1\11\2\1\1\11\12\1\1\11\1\1\1\11\2\1"+
    "\1\11\3\1\2\11\2\1\1\11\1\1\1\11\5\1"+
    "\1\11\12\1\1\11\1\0\1\1\5\11\1\1\1\0"+
    "\1\1\1\11\1\0\2\1\1\11\1\1\1\0\3\1"+
    "\2\11\1\1\1\0\1\11\6\0\1\11\1\0\3\1"+
    "\1\11\2\1\2\0\2\1\2\0\1\11\2\0\12\1"+
    "\1\11\1\0\1\11\1\0\1\11\1\0\1\1\1\0"+
    "\2\1\3\0\1\11\1\0\1\11\1\0\2\1\1\11"+
    "\2\1\1\11\1\0\14\1\4\0\6\1\2\0\1\11"+
    "\6\0\1\11\5\0\1\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[231];
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

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  _CmdLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _CmdLexer(java.io.InputStream in) {
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
    while (i < 238) {
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
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
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
        case 64: 
          { yybegin(SET); yypushback(1); return CmdTokenType.ENVIRONMENT_VARIABLE_DEFINITION;
          }
        case 82: break;
        case 34: 
          { yybegin(IF_VARIABLE); return CmdTokenType.BAD_CHARACTER;
          }
        case 83: break;
        case 28: 
          { yybegin(IF); return CmdTokenType.WHITE_SPACE;
          }
        case 84: break;
        case 69: 
          { yybegin(NEXT_SYM); return CmdTokenType.STRING_LITERAL;
          }
        case 85: break;
        case 57: 
          { yybegin(YYINITIAL); return CmdTokenType.DO_KEYWORD;
          }
        case 86: break;
        case 22: 
          { yybegin(FOR_IN); return CmdTokenType.LEFT_PARENTHESIS;
          }
        case 87: break;
        case 41: 
          { yybegin(SET_VALUE); return CmdTokenType.EQUAL_OPERATOR;
          }
        case 88: break;
        case 48: 
          { yybegin(REM); yypushback(yylength());
          }
        case 89: break;
        case 60: 
          { yybegin(IF_EQUAL); return CmdTokenType.EQUAL_OPERATOR;
          }
        case 90: break;
        case 72: 
          { yybegin(FOR); return CmdTokenType.FOR_KEYWORD;
          }
        case 91: break;
        case 74: 
          { yybegin(CALL); return CmdTokenType.CALL_KEYWORD;
          }
        case 92: break;
        case 42: 
          { yybegin(SET_VALUE); return CmdTokenType.EXPRESSION;
          }
        case 93: break;
        case 37: 
          { yybegin(IF_EQUAL); return CmdTokenType.BAD_CHARACTER;
          }
        case 94: break;
        case 27: 
          { yybegin(IF); return CmdTokenType.EXPRESSION;
          }
        case 95: break;
        case 58: 
          { yybegin(GOTO); return CmdTokenType.EXPRESSION;
          }
        case 96: break;
        case 5: 
          { yybegin(YYINITIAL); return CmdTokenType.APPEND_OPERATOR;
          }
        case 97: break;
        case 52: 
          { yybegin(YYINITIAL); yypushback(yylength() - 1); return CmdTokenType.ECHO_OFF_MARKER;
          }
        case 98: break;
        case 54: 
          { yybegin(CALL); return CmdTokenType.LABEL_REFERENCE;
          }
        case 99: break;
        case 53: 
          { yybegin(CALL); return CmdTokenType.STRING_LITERAL;
          }
        case 100: break;
        case 8: 
          { yybegin(LABEL); return CmdTokenType.LABEL_MARKER;
          }
        case 101: break;
        case 67: 
          { yybegin(COMMAND); return CmdTokenType.STRING_LITERAL;
          }
        case 102: break;
        case 65: 
          { yybegin(SET_VALUE); yypushback(yylength() - 1); return CmdTokenType.EQUAL_OPERATOR;
          }
        case 103: break;
        case 81: 
          { yybegin(IF_DIGIT); return CmdTokenType.CMDEXTVERSION_KEYWORD;
          }
        case 104: break;
        case 33: 
          { yybegin(YYINITIAL); return CmdTokenType.DIGIT;
          }
        case 105: break;
        case 6: 
          { yybegin(YYINITIAL); return CmdTokenType.GET_OPERATOR;
          }
        case 106: break;
        case 66: 
          { yybegin(SET_VALUE); return CmdTokenType.STRING_LITERAL;
          }
        case 107: break;
        case 14: 
          { yybegin(CALL); return CmdTokenType.BAD_CHARACTER;
          }
        case 108: break;
        case 78: 
          { yybegin(IF_EXIST); return CmdTokenType.EXIST_KEYWORD;
          }
        case 109: break;
        case 12: 
          { yybegin(CALL); return CmdTokenType.EXPRESSION;
          }
        case 110: break;
        case 23: 
          { yybegin(FOR); return CmdTokenType.RIGHT_PARENTHESIS;
          }
        case 111: break;
        case 26: 
          { yybegin(GOTO); return CmdTokenType.BAD_CHARACTER;
          }
        case 112: break;
        case 75: 
          { yybegin(GOTO); return CmdTokenType.GOTO_KEYWORD;
          }
        case 113: break;
        case 32: 
          { yybegin(IF_DIGIT); return CmdTokenType.WHITE_SPACE;
          }
        case 114: break;
        case 25: 
          { yybegin(GOTO); return CmdTokenType.WHITE_SPACE;
          }
        case 115: break;
        case 24: 
          { yybegin(GOTO); return CmdTokenType.LABEL_REFERENCE;
          }
        case 116: break;
        case 38: 
          { yybegin(REM); return CmdTokenType.COMMENT;
          }
        case 117: break;
        case 47: 
          { yybegin(LABEL); return CmdTokenType.WHITE_SPACE;
          }
        case 118: break;
        case 11: 
          { yybegin(YYINITIAL); yypushback(yylength());
          }
        case 119: break;
        case 43: 
          { yybegin(SET_VALUE); return CmdTokenType.WHITE_SPACE;
          }
        case 120: break;
        case 19: 
          { yybegin(FOR); return CmdTokenType.WHITE_SPACE;
          }
        case 121: break;
        case 76: 
          { yybegin(ECHO); return CmdTokenType.ECHO_KEYWORD;
          }
        case 122: break;
        case 30: 
          { yybegin(IF_EXIST); return CmdTokenType.BAD_CHARACTER;
          }
        case 123: break;
        case 51: 
          { yybegin(YYINITIAL); return CmdTokenType.EXPRESSION;
          }
        case 124: break;
        case 56: 
          { yybegin(FOR_IN); return CmdTokenType.IN_KEYWORD;
          }
        case 125: break;
        case 16: 
          { yybegin(ECHO); return CmdTokenType.WHITE_SPACE;
          }
        case 126: break;
        case 15: 
          { yybegin(ECHO_SYM); return CmdTokenType.STRING_LITERAL;
          }
        case 127: break;
        case 49: 
          { yybegin(YYINITIAL); return CmdTokenType.OR_OPERATOR;
          }
        case 128: break;
        case 45: 
          { yybegin(COMMAND); return CmdTokenType.WHITE_SPACE;
          }
        case 129: break;
        case 21: 
          { yybegin(FOR_IN); return CmdTokenType.WHITE_SPACE;
          }
        case 130: break;
        case 73: 
          { yybegin(SET); return CmdTokenType.SET_KEYWORD;
          }
        case 131: break;
        case 61: 
          { yybegin(IF_EXIST); return CmdTokenType.STRING_LITERAL;
          }
        case 132: break;
        case 10: 
          { yybegin(NEXT_SYM); return CmdTokenType.EXPRESSION;
          }
        case 133: break;
        case 40: 
          { yybegin(SET); return CmdTokenType.WHITE_SPACE;
          }
        case 134: break;
        case 62: 
          { yybegin(IF_EXIST); return CmdTokenType.EXPRESSION;
          }
        case 135: break;
        case 31: 
          { yybegin(IF_DIGIT); return CmdTokenType.BAD_CHARACTER;
          }
        case 136: break;
        case 80: 
          { yybegin(IF_DIGIT); return CmdTokenType.ERRORLEVEL_KEYWORD;
          }
        case 137: break;
        case 71: 
          { yybegin(IF); return CmdTokenType.NOT_KEYWORD;
          }
        case 138: break;
        case 50: 
          { yybegin(YYINITIAL); return CmdTokenType.AND_OPERATOR;
          }
        case 139: break;
        case 20: 
          { yybegin(FOR_IN); return CmdTokenType.EXPRESSION;
          }
        case 140: break;
        case 79: 
          { yybegin(IF_VARIABLE); return CmdTokenType.DEFINED_KEYWORD;
          }
        case 141: break;
        case 70: 
          { yybegin(YYINITIAL); return CmdTokenType.OFF_KEYWORD;
          }
        case 142: break;
        case 39: 
          { yybegin(SET); return CmdTokenType.BAD_CHARACTER;
          }
        case 143: break;
        case 4: 
          { yybegin(YYINITIAL); return CmdTokenType.PIPE_OPERATOR;
          }
        case 144: break;
        case 59: 
          { yybegin(IF); return CmdTokenType.STRING_LITERAL;
          }
        case 145: break;
        case 3: 
          { yybegin(NEXT_SYM); yypushback(yylength());
          }
        case 146: break;
        case 36: 
          { yybegin(IF_EQUAL); return CmdTokenType.WHITE_SPACE;
          }
        case 147: break;
        case 77: 
          { yybegin(COMMAND); return CmdTokenType.ELSE_KEYWORD;
          }
        case 148: break;
        case 29: 
          { yybegin(IF_EXIST); return CmdTokenType.WHITE_SPACE;
          }
        case 149: break;
        case 2: 
          { yybegin(YYINITIAL); return CmdTokenType.WHITE_SPACE;
          }
        case 150: break;
        case 13: 
          { yybegin(CALL); return CmdTokenType.WHITE_SPACE;
          }
        case 151: break;
        case 17: 
          { yybegin(ECHO_SYM); return CmdTokenType.WHITE_SPACE;
          }
        case 152: break;
        case 35: 
          { yybegin(IF_VARIABLE); return CmdTokenType.WHITE_SPACE;
          }
        case 153: break;
        case 55: 
          { yybegin(YYINITIAL); return CmdTokenType.ON_KEYWORD;
          }
        case 154: break;
        case 1: 
          { yybegin(COMMAND); yypushback(yylength());
          }
        case 155: break;
        case 46: 
          { yybegin(REM);  return CmdTokenType.LABEL;
          }
        case 156: break;
        case 63: 
          { yybegin(YYINITIAL); return CmdTokenType.STRING_LITERAL;
          }
        case 157: break;
        case 68: 
          { yybegin(IF); return CmdTokenType.IF_KEYWORD;
          }
        case 158: break;
        case 7: 
          { yybegin(YYINITIAL); return CmdTokenType.PUT_OPERATOR;
          }
        case 159: break;
        case 18: 
          { yybegin(FOR); return CmdTokenType.EXPRESSION;
          }
        case 160: break;
        case 44: 
          { yybegin(COMMAND); return CmdTokenType.EXPRESSION;
          }
        case 161: break;
        case 9: 
          { yybegin(NEXT_SYM); return CmdTokenType.WHITE_SPACE;
          }
        case 162: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
