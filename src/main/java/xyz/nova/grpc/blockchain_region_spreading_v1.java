// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blockchain_region_param_v1.proto

package xyz.nova.grpc;

/**
 * Protobuf type {@code helium.blockchain_region_spreading_v1}
 */
public final class blockchain_region_spreading_v1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helium.blockchain_region_spreading_v1)
    blockchain_region_spreading_v1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use blockchain_region_spreading_v1.newBuilder() to construct.
  private blockchain_region_spreading_v1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private blockchain_region_spreading_v1() {
    taggedSpreading_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new blockchain_region_spreading_v1();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.nova.grpc.regionparam.internal_static_helium_blockchain_region_spreading_v1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.nova.grpc.regionparam.internal_static_helium_blockchain_region_spreading_v1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.nova.grpc.blockchain_region_spreading_v1.class, xyz.nova.grpc.blockchain_region_spreading_v1.Builder.class);
  }

  public static final int TAGGED_SPREADING_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<xyz.nova.grpc.tagged_spreading> taggedSpreading_;
  /**
   * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
   */
  @java.lang.Override
  public java.util.List<xyz.nova.grpc.tagged_spreading> getTaggedSpreadingList() {
    return taggedSpreading_;
  }
  /**
   * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends xyz.nova.grpc.tagged_spreadingOrBuilder> 
      getTaggedSpreadingOrBuilderList() {
    return taggedSpreading_;
  }
  /**
   * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
   */
  @java.lang.Override
  public int getTaggedSpreadingCount() {
    return taggedSpreading_.size();
  }
  /**
   * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
   */
  @java.lang.Override
  public xyz.nova.grpc.tagged_spreading getTaggedSpreading(int index) {
    return taggedSpreading_.get(index);
  }
  /**
   * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
   */
  @java.lang.Override
  public xyz.nova.grpc.tagged_spreadingOrBuilder getTaggedSpreadingOrBuilder(
      int index) {
    return taggedSpreading_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < taggedSpreading_.size(); i++) {
      output.writeMessage(1, taggedSpreading_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < taggedSpreading_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, taggedSpreading_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof xyz.nova.grpc.blockchain_region_spreading_v1)) {
      return super.equals(obj);
    }
    xyz.nova.grpc.blockchain_region_spreading_v1 other = (xyz.nova.grpc.blockchain_region_spreading_v1) obj;

    if (!getTaggedSpreadingList()
        .equals(other.getTaggedSpreadingList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTaggedSpreadingCount() > 0) {
      hash = (37 * hash) + TAGGED_SPREADING_FIELD_NUMBER;
      hash = (53 * hash) + getTaggedSpreadingList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.blockchain_region_spreading_v1 parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(xyz.nova.grpc.blockchain_region_spreading_v1 prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code helium.blockchain_region_spreading_v1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helium.blockchain_region_spreading_v1)
      xyz.nova.grpc.blockchain_region_spreading_v1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.nova.grpc.regionparam.internal_static_helium_blockchain_region_spreading_v1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.nova.grpc.regionparam.internal_static_helium_blockchain_region_spreading_v1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.nova.grpc.blockchain_region_spreading_v1.class, xyz.nova.grpc.blockchain_region_spreading_v1.Builder.class);
    }

    // Construct using xyz.nova.grpc.blockchain_region_spreading_v1.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (taggedSpreadingBuilder_ == null) {
        taggedSpreading_ = java.util.Collections.emptyList();
      } else {
        taggedSpreading_ = null;
        taggedSpreadingBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.nova.grpc.regionparam.internal_static_helium_blockchain_region_spreading_v1_descriptor;
    }

    @java.lang.Override
    public xyz.nova.grpc.blockchain_region_spreading_v1 getDefaultInstanceForType() {
      return xyz.nova.grpc.blockchain_region_spreading_v1.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.nova.grpc.blockchain_region_spreading_v1 build() {
      xyz.nova.grpc.blockchain_region_spreading_v1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.nova.grpc.blockchain_region_spreading_v1 buildPartial() {
      xyz.nova.grpc.blockchain_region_spreading_v1 result = new xyz.nova.grpc.blockchain_region_spreading_v1(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(xyz.nova.grpc.blockchain_region_spreading_v1 result) {
      if (taggedSpreadingBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          taggedSpreading_ = java.util.Collections.unmodifiableList(taggedSpreading_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.taggedSpreading_ = taggedSpreading_;
      } else {
        result.taggedSpreading_ = taggedSpreadingBuilder_.build();
      }
    }

    private void buildPartial0(xyz.nova.grpc.blockchain_region_spreading_v1 result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.nova.grpc.blockchain_region_spreading_v1) {
        return mergeFrom((xyz.nova.grpc.blockchain_region_spreading_v1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.nova.grpc.blockchain_region_spreading_v1 other) {
      if (other == xyz.nova.grpc.blockchain_region_spreading_v1.getDefaultInstance()) return this;
      if (taggedSpreadingBuilder_ == null) {
        if (!other.taggedSpreading_.isEmpty()) {
          if (taggedSpreading_.isEmpty()) {
            taggedSpreading_ = other.taggedSpreading_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTaggedSpreadingIsMutable();
            taggedSpreading_.addAll(other.taggedSpreading_);
          }
          onChanged();
        }
      } else {
        if (!other.taggedSpreading_.isEmpty()) {
          if (taggedSpreadingBuilder_.isEmpty()) {
            taggedSpreadingBuilder_.dispose();
            taggedSpreadingBuilder_ = null;
            taggedSpreading_ = other.taggedSpreading_;
            bitField0_ = (bitField0_ & ~0x00000001);
            taggedSpreadingBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTaggedSpreadingFieldBuilder() : null;
          } else {
            taggedSpreadingBuilder_.addAllMessages(other.taggedSpreading_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              xyz.nova.grpc.tagged_spreading m =
                  input.readMessage(
                      xyz.nova.grpc.tagged_spreading.parser(),
                      extensionRegistry);
              if (taggedSpreadingBuilder_ == null) {
                ensureTaggedSpreadingIsMutable();
                taggedSpreading_.add(m);
              } else {
                taggedSpreadingBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<xyz.nova.grpc.tagged_spreading> taggedSpreading_ =
      java.util.Collections.emptyList();
    private void ensureTaggedSpreadingIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        taggedSpreading_ = new java.util.ArrayList<xyz.nova.grpc.tagged_spreading>(taggedSpreading_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        xyz.nova.grpc.tagged_spreading, xyz.nova.grpc.tagged_spreading.Builder, xyz.nova.grpc.tagged_spreadingOrBuilder> taggedSpreadingBuilder_;

    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public java.util.List<xyz.nova.grpc.tagged_spreading> getTaggedSpreadingList() {
      if (taggedSpreadingBuilder_ == null) {
        return java.util.Collections.unmodifiableList(taggedSpreading_);
      } else {
        return taggedSpreadingBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public int getTaggedSpreadingCount() {
      if (taggedSpreadingBuilder_ == null) {
        return taggedSpreading_.size();
      } else {
        return taggedSpreadingBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public xyz.nova.grpc.tagged_spreading getTaggedSpreading(int index) {
      if (taggedSpreadingBuilder_ == null) {
        return taggedSpreading_.get(index);
      } else {
        return taggedSpreadingBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public Builder setTaggedSpreading(
        int index, xyz.nova.grpc.tagged_spreading value) {
      if (taggedSpreadingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaggedSpreadingIsMutable();
        taggedSpreading_.set(index, value);
        onChanged();
      } else {
        taggedSpreadingBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public Builder setTaggedSpreading(
        int index, xyz.nova.grpc.tagged_spreading.Builder builderForValue) {
      if (taggedSpreadingBuilder_ == null) {
        ensureTaggedSpreadingIsMutable();
        taggedSpreading_.set(index, builderForValue.build());
        onChanged();
      } else {
        taggedSpreadingBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public Builder addTaggedSpreading(xyz.nova.grpc.tagged_spreading value) {
      if (taggedSpreadingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaggedSpreadingIsMutable();
        taggedSpreading_.add(value);
        onChanged();
      } else {
        taggedSpreadingBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public Builder addTaggedSpreading(
        int index, xyz.nova.grpc.tagged_spreading value) {
      if (taggedSpreadingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaggedSpreadingIsMutable();
        taggedSpreading_.add(index, value);
        onChanged();
      } else {
        taggedSpreadingBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public Builder addTaggedSpreading(
        xyz.nova.grpc.tagged_spreading.Builder builderForValue) {
      if (taggedSpreadingBuilder_ == null) {
        ensureTaggedSpreadingIsMutable();
        taggedSpreading_.add(builderForValue.build());
        onChanged();
      } else {
        taggedSpreadingBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public Builder addTaggedSpreading(
        int index, xyz.nova.grpc.tagged_spreading.Builder builderForValue) {
      if (taggedSpreadingBuilder_ == null) {
        ensureTaggedSpreadingIsMutable();
        taggedSpreading_.add(index, builderForValue.build());
        onChanged();
      } else {
        taggedSpreadingBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public Builder addAllTaggedSpreading(
        java.lang.Iterable<? extends xyz.nova.grpc.tagged_spreading> values) {
      if (taggedSpreadingBuilder_ == null) {
        ensureTaggedSpreadingIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, taggedSpreading_);
        onChanged();
      } else {
        taggedSpreadingBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public Builder clearTaggedSpreading() {
      if (taggedSpreadingBuilder_ == null) {
        taggedSpreading_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        taggedSpreadingBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public Builder removeTaggedSpreading(int index) {
      if (taggedSpreadingBuilder_ == null) {
        ensureTaggedSpreadingIsMutable();
        taggedSpreading_.remove(index);
        onChanged();
      } else {
        taggedSpreadingBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public xyz.nova.grpc.tagged_spreading.Builder getTaggedSpreadingBuilder(
        int index) {
      return getTaggedSpreadingFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public xyz.nova.grpc.tagged_spreadingOrBuilder getTaggedSpreadingOrBuilder(
        int index) {
      if (taggedSpreadingBuilder_ == null) {
        return taggedSpreading_.get(index);  } else {
        return taggedSpreadingBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public java.util.List<? extends xyz.nova.grpc.tagged_spreadingOrBuilder> 
         getTaggedSpreadingOrBuilderList() {
      if (taggedSpreadingBuilder_ != null) {
        return taggedSpreadingBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(taggedSpreading_);
      }
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public xyz.nova.grpc.tagged_spreading.Builder addTaggedSpreadingBuilder() {
      return getTaggedSpreadingFieldBuilder().addBuilder(
          xyz.nova.grpc.tagged_spreading.getDefaultInstance());
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public xyz.nova.grpc.tagged_spreading.Builder addTaggedSpreadingBuilder(
        int index) {
      return getTaggedSpreadingFieldBuilder().addBuilder(
          index, xyz.nova.grpc.tagged_spreading.getDefaultInstance());
    }
    /**
     * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
     */
    public java.util.List<xyz.nova.grpc.tagged_spreading.Builder> 
         getTaggedSpreadingBuilderList() {
      return getTaggedSpreadingFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        xyz.nova.grpc.tagged_spreading, xyz.nova.grpc.tagged_spreading.Builder, xyz.nova.grpc.tagged_spreadingOrBuilder> 
        getTaggedSpreadingFieldBuilder() {
      if (taggedSpreadingBuilder_ == null) {
        taggedSpreadingBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            xyz.nova.grpc.tagged_spreading, xyz.nova.grpc.tagged_spreading.Builder, xyz.nova.grpc.tagged_spreadingOrBuilder>(
                taggedSpreading_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        taggedSpreading_ = null;
      }
      return taggedSpreadingBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:helium.blockchain_region_spreading_v1)
  }

  // @@protoc_insertion_point(class_scope:helium.blockchain_region_spreading_v1)
  private static final xyz.nova.grpc.blockchain_region_spreading_v1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.nova.grpc.blockchain_region_spreading_v1();
  }

  public static xyz.nova.grpc.blockchain_region_spreading_v1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<blockchain_region_spreading_v1>
      PARSER = new com.google.protobuf.AbstractParser<blockchain_region_spreading_v1>() {
    @java.lang.Override
    public blockchain_region_spreading_v1 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<blockchain_region_spreading_v1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<blockchain_region_spreading_v1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.nova.grpc.blockchain_region_spreading_v1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

