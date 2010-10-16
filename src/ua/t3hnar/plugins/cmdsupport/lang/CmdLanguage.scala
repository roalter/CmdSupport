package ua.t3hnar.plugins.cmdsupport.lang

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.{SyntaxHighlighter, SingleLazyInstanceSyntaxHighlighterFactory}
import ua.t3hnar.plugins.cmdsupport.editor.highlighting.CmdSyntaxHighlighter

/**
 * @author Yaroslav Klymko aka t3hnar
 */
object CmdLanguage extends Language(Cmd.LANGUAGE_NAME) {
	private class BashHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {
		protected def createHighlighter: SyntaxHighlighter = {
			return new CmdSyntaxHighlighter
		}
	}
}