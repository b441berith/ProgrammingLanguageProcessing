package com.processor;

import java.io.OutputStream;

import com.processor.exceptions.CompilationException;

/**
 * User: ashuiskov
 * Date: 18/03/2012
 * Time: 17:16
 */
public interface Compiler<P extends AbstractProgram> {
    public void compile(OutputStream outputStream, P program) throws CompilationException;
}
