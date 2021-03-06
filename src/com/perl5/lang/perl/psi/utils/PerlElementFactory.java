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

package com.perl5.lang.perl.psi.utils;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.util.PsiTreeUtil;
import com.perl5.lang.perl.PerlFileTypePackage;
import com.perl5.lang.perl.psi.*;
import com.perl5.lang.perl.psi.impl.PerlFileElement;
import com.perl5.lang.perl.psi.impl.*;

public class PerlElementFactory
{
	public static PerlNamespaceElementImpl createPackageName(Project project, String name)
	{
		PerlFileElement file = createFile(project, "package " + name + ";");
		PsiPerlNamespaceDefinition def = PsiTreeUtil.findChildOfType(file, PsiPerlNamespaceDefinition.class);
		assert def != null;
		return (PerlNamespaceElementImpl)def.getNamespaceElement();
	}

	public static PerlSubNameElement createUserFunction(Project project, String name)
	{
		PerlFileElement file = createFile(project, "sub " + name + ";");
		PsiPerlSubDeclaration decl = PsiTreeUtil.findChildOfType(file, PsiPerlSubDeclaration.class);
		assert decl != null;
		return decl.getSubNameElement();
	}

	public static PerlVariableNameElement createVariableName(Project project, String name)
	{
		PerlFileElement file = createFile(project, "$" + name + ";");
		PsiPerlScalarVariable scalar = PsiTreeUtil.findChildOfType(file, PsiPerlScalarVariable.class);
		assert scalar != null;
		return scalar.getVariableNameElement();
	}

	public static PerlHeredocTerminatorElementImpl createHereDocTerminator(Project project, String name)
	{
		PerlFileElement file = createFile(project, "<<'" + name + "';\n"+name+"\n");
		return PsiTreeUtil.findChildOfType(file, PerlHeredocTerminatorElementImpl.class);
	}

	public static PerlStringContentElementImpl createStringContent(Project project, String name)
	{
		PerlFileElement file = createFile(project, "'"+name+"';");
		PsiPerlStringSq string = PsiTreeUtil.findChildOfType(file, PsiPerlStringSq.class);
		assert string != null;
		return (PerlStringContentElementImpl) string.getFirstChild().getNextSibling();
	}

	public static PerlFileElement createFile(Project project, String text)
	{
		String fileName = "file.dummy";
		return (PerlFileElement) PsiFileFactory.getInstance(project).
				createFileFromText(fileName, PerlFileTypePackage.INSTANCE, text);
	}

}
