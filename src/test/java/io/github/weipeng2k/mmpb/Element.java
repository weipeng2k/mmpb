package io.github.weipeng2k.mmpb;

/**
 * <pre>
 * 元素
 * </pre>
 *
 * @author weipeng2k 2021年08月13日 下午22:21:22
 */
public interface Element {

    void accept(Visitor visitor);
}
