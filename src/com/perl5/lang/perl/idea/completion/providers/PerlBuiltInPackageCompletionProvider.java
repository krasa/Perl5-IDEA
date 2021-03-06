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

package com.perl5.lang.perl.idea.completion.providers;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ProcessingContext;
import com.perl5.PerlIcons;
import com.perl5.lang.perl.idea.completion.inserthandlers.PerlPackageInsertHandler;
import com.perl5.lang.perl.lexer.PerlElementTypes;
import com.perl5.lang.perl.parser.PerlPackage;
import com.perl5.lang.perl.psi.PsiPerlStatement;
import com.perl5.lang.perl.psi.PsiPerlUseStatement;
import com.perl5.lang.perl.util.PerlPackageUtil;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hurricup on 31.05.2015.
 *
 */
public class PerlBuiltInPackageCompletionProvider extends CompletionProvider<CompletionParameters>
{
	@Override
	protected void addCompletions(@NotNull final CompletionParameters parameters, final ProcessingContext context, @NotNull final CompletionResultSet resultSet)
	{
		ApplicationManager.getApplication().runReadAction(new Runnable()
		{
			@Override
			public void run()
			{
				// built in packages
				PsiElement element = parameters.getPosition();

				for (String packageName : PerlPackageUtil.BUILT_IN)
				{
					resultSet.addElement(LookupElementBuilder
									.create(element, packageName)
									.withIcon(PerlIcons.PACKAGE_GUTTER_ICON)
									.withBoldness(true)
									.withInsertHandler(PerlPackageInsertHandler.INSTANCE)
					);
				}

				// todo some decoration for pragma
				for (String packageName : PerlPackageUtil.BUILT_IN_PRAGMA)
				{
					resultSet.addElement(LookupElementBuilder
							.create(element, packageName)
							.withIcon(PerlIcons.PACKAGE_GUTTER_ICON)
							.withBoldness(true)
							.withInsertHandler(PerlPackageInsertHandler.INSTANCE)
					);
				}

				for (String packageName : PerlPackageUtil.BUILT_IN_DEPRECATED)
				{
					resultSet.addElement(LookupElementBuilder
							.create(element, packageName)
							.withIcon(PerlIcons.PACKAGE_GUTTER_ICON)
							.withBoldness(true)
							.withInsertHandler(PerlPackageInsertHandler.INSTANCE)
							.withStrikeoutness(true)
					);
				}

			}
		});
	}
}
