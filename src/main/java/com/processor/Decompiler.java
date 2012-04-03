package com.processor;

import java.io.InputStream;

import com.processor.exceptions.DecompilationException;

/**
 * User: ashuiskov
 * Date: 18/03/2012
 * Time: 16:45
 */
public interface Decompiler<P extends AbstractProgram> {
    public P decompile(InputStream inputStream) throws DecompilationException;
}
