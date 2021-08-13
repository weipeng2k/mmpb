package io.github.weipeng2k.mmpb;

/**
 * @author weipeng2k 2021年08月13日 下午22:23:09
 */
public abstract class Visitor {

    abstract void visit(Res res);

    abstract void visit(Dir dir);
}
