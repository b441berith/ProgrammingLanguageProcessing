package com.processor.vm;

/**
 * User: ashuiskov
 * Date: 03/04/2012
 * Time: 16:00
 */
public interface VMRegister<M,V> {
    public M getMemoryPointer();
    public V getValue();
}
