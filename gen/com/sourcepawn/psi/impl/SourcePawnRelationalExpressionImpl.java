// This is a generated file. Not intended for manual editing.
package com.sourcepawn.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.sourcepawn.psi.SourcePawnTypes.*;
import com.sourcepawn.psi.*;

public class SourcePawnRelationalExpressionImpl extends SourcePawnExpressionImpl implements SourcePawnRelationalExpression {

  public SourcePawnRelationalExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SourcePawnVisitor) ((SourcePawnVisitor)visitor).visitRelationalExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SourcePawnExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SourcePawnExpression.class);
  }

  @Override
  @NotNull
  public List<SourcePawnIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SourcePawnIdentifier.class);
  }

  @Override
  @Nullable
  public SourcePawnPrefixExpressionOperator getPrefixExpressionOperator() {
    return findChildByClass(SourcePawnPrefixExpressionOperator.class);
  }

  @Override
  @Nullable
  public SourcePawnRelationalOperator getRelationalOperator() {
    return findChildByClass(SourcePawnRelationalOperator.class);
  }

  @Override
  @NotNull
  public List<SourcePawnSuffixExpressionOperator> getSuffixExpressionOperatorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SourcePawnSuffixExpressionOperator.class);
  }

  @Override
  @Nullable
  public SourcePawnTagIdentifier getTagIdentifier() {
    return findChildByClass(SourcePawnTagIdentifier.class);
  }

}
