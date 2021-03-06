// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.sourcepawn.psi.SourcePawnTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.sourcepawn.psi.*;

public class SourcePawnLocalVarStatementImpl extends ASTWrapperPsiElement implements SourcePawnLocalVarStatement {

  public SourcePawnLocalVarStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitLocalVarStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SourcePawnCommaList getCommaList() {
    return findChildByClass(SourcePawnCommaList.class);
  }

  @Override
  @NotNull
  public SourcePawnLocalVarModifier getLocalVarModifier() {
    return findNotNullChildByClass(SourcePawnLocalVarModifier.class);
  }

  @Override
  @Nullable
  public SourcePawnVarInit getVarInit() {
    return findChildByClass(SourcePawnVarInit.class);
  }

}
