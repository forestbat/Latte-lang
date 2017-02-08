/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 KuiGang Wang
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package lt.compiler.semantic;

/**
 * method handle<br>
 * should not use after version changing to 1.6
 */
@Deprecated
public class MethodHandleValue implements Value {
        private final SMethodDef method;
        private final int mode;
        private final STypeDef type;

        /**
         * construct a new method handle object
         *
         * @param method the method handle method
         * @param mode   defined in {@link lt.lang.Dynamic}
         * @param type   MethodHandle_Class
         */
        public MethodHandleValue(SMethodDef method, int mode, STypeDef type) {
                this.method = method;
                this.mode = mode;
                this.type = type;
        }

        @Override
        public STypeDef type() {
                return type;
        }

        public SMethodDef method() {
                return method;
        }

        public int mode() {
                return mode;
        }
}
