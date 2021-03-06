package me.prettyprint.hector.api.beans;

import java.nio.ByteBuffer;
import java.util.List;

public class DynamicComposite extends AbstractComposite {

  public final static String DEFAULT_DYNAMIC_COMPOSITE_ALIASES = "(a=>AsciiType,b=>BytesType,i=>Int32Type,m=>IntegerType,x=>LexicalUUIDType,l=>LongType,d=>DoubleType,t=>TimeUUIDType,s=>UTF8Type,u=>UUIDType,A=>AsciiType(reversed=true),B=>BytesType(reversed=true),I=>Int32Type(reversed=true),M=>IntegerType(reversed=true),X=>LexicalUUIDType(reversed=true),L=>LongType(reversed=true),D=>DoubleType(reversed=true),T=>TimeUUIDType(reversed=true),S=>UTF8Type(reversed=true),U=>UUIDType(reversed=true))";

  public DynamicComposite() {
    super(true);
  }

  public DynamicComposite(Object... o) {
    super(true, o);
  }

  public DynamicComposite(List<?> l) {
    super(true, l);
  }

  public static DynamicComposite fromByteBuffer(ByteBuffer byteBuffer) {

    DynamicComposite composite = new DynamicComposite();
    composite.deserialize(byteBuffer);

    return composite;
  }

  public static ByteBuffer toByteBuffer(Object... o) {
    DynamicComposite composite = new DynamicComposite(o);
    return composite.serialize();
  }

  public static ByteBuffer toByteBuffer(List<?> l) {
    DynamicComposite composite = new DynamicComposite(l);
    return composite.serialize();
  }
}
