var matrix = new Matrix4f();
glUniformName = glGetUniformLocation(glShaderProgramName, "projectionMatrix");
try (MemoryStack stack = MemoryStack.stackPush()) {
  FloatBuffer fb = stack.mallocFloat(16);
  matrix.get(fb);
  glUniformMatrix4fv(glUniformName, false, fb);
}