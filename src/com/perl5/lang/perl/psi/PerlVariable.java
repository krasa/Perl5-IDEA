/*
 * Copyright 2015 Alexandr Evstigneev
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

package com.perl5.lang.perl.psi;

import com.intellij.psi.PsiElement;
import com.perl5.lang.perl.psi.properties.*;
import com.perl5.lang.perl.psi.utils.PerlVariableType;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Created by hurricup on 27.05.2015.
 */
public interface PerlVariable extends PsiElement, PerlLexicalScopeMember, PerlPackageMember, PerlNamespaceElementContainer, PerlVariableNameElementContainer, PerlNamedElement
{
	/**
	 * Dumb getter for scalar sigils part, shows if it's pure type or some dereferences like @$$$var
	 * @return scalar sigils if any
	 */
	@Nullable
	PsiPerlScalarSigils getScalarSigils();

	/**
	 * Guesses variable type from definition or context
	 * @return Package name if found
	 */
	@Nullable String guessVariableType();

	/**
	 * Guessing actual variable type from context
	 * @return variable type
	 */
	PerlVariableType getActualType();

	/**
	 * Looking for lexical declaration of variable
	 * @return declare variable or null
	 */
	PerlVariable getLexicalDeclaration();

	/**
	 * Looking for global variable declarations sutable for current variable
	 * @return list of global declarations
	 */
	List<PerlVariable> getGlobalDeclarations();

	/**
	 * Looking for globs, sutable for current variable
	 * @return list of globs
	 */
	List<PerlGlobVariable> getRelatedGlobs();

	/**
	 * Returns line number of element in the document
	 * @return list of globs
	 */
	int getLineNumber();



}
