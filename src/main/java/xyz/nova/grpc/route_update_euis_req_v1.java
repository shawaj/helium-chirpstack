// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package xyz.nova.grpc;

/**
 * Protobuf type {@code helium.iot_config.route_update_euis_req_v1}
 */
public final class route_update_euis_req_v1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helium.iot_config.route_update_euis_req_v1)
    route_update_euis_req_v1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use route_update_euis_req_v1.newBuilder() to construct.
  private route_update_euis_req_v1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private route_update_euis_req_v1() {
    action_ = 0;
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new route_update_euis_req_v1();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_route_update_euis_req_v1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_route_update_euis_req_v1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.nova.grpc.route_update_euis_req_v1.class, xyz.nova.grpc.route_update_euis_req_v1.Builder.class);
  }

  public static final int ACTION_FIELD_NUMBER = 1;
  private int action_ = 0;
  /**
   * <code>.helium.iot_config.action_v1 action = 1;</code>
   * @return The enum numeric value on the wire for action.
   */
  @java.lang.Override public int getActionValue() {
    return action_;
  }
  /**
   * <code>.helium.iot_config.action_v1 action = 1;</code>
   * @return The action.
   */
  @java.lang.Override public xyz.nova.grpc.action_v1 getAction() {
    xyz.nova.grpc.action_v1 result = xyz.nova.grpc.action_v1.forNumber(action_);
    return result == null ? xyz.nova.grpc.action_v1.UNRECOGNIZED : result;
  }

  public static final int EUI_PAIR_FIELD_NUMBER = 2;
  private xyz.nova.grpc.eui_pair_v1 euiPair_;
  /**
   * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
   * @return Whether the euiPair field is set.
   */
  @java.lang.Override
  public boolean hasEuiPair() {
    return euiPair_ != null;
  }
  /**
   * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
   * @return The euiPair.
   */
  @java.lang.Override
  public xyz.nova.grpc.eui_pair_v1 getEuiPair() {
    return euiPair_ == null ? xyz.nova.grpc.eui_pair_v1.getDefaultInstance() : euiPair_;
  }
  /**
   * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
   */
  @java.lang.Override
  public xyz.nova.grpc.eui_pair_v1OrBuilder getEuiPairOrBuilder() {
    return euiPair_ == null ? xyz.nova.grpc.eui_pair_v1.getDefaultInstance() : euiPair_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private long timestamp_ = 0L;
  /**
   * <pre>
   * in milliseconds since unix epoch
   * </pre>
   *
   * <code>uint64 timestamp = 3;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes signature = 4;</code>
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
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
    if (action_ != xyz.nova.grpc.action_v1.add.getNumber()) {
      output.writeEnum(1, action_);
    }
    if (euiPair_ != null) {
      output.writeMessage(2, getEuiPair());
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(3, timestamp_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(4, signature_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (action_ != xyz.nova.grpc.action_v1.add.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, action_);
    }
    if (euiPair_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEuiPair());
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, timestamp_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, signature_);
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
    if (!(obj instanceof xyz.nova.grpc.route_update_euis_req_v1)) {
      return super.equals(obj);
    }
    xyz.nova.grpc.route_update_euis_req_v1 other = (xyz.nova.grpc.route_update_euis_req_v1) obj;

    if (action_ != other.action_) return false;
    if (hasEuiPair() != other.hasEuiPair()) return false;
    if (hasEuiPair()) {
      if (!getEuiPair()
          .equals(other.getEuiPair())) return false;
    }
    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    if (hasEuiPair()) {
      hash = (37 * hash) + EUI_PAIR_FIELD_NUMBER;
      hash = (53 * hash) + getEuiPair().hashCode();
    }
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.nova.grpc.route_update_euis_req_v1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.route_update_euis_req_v1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.route_update_euis_req_v1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.route_update_euis_req_v1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.route_update_euis_req_v1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.route_update_euis_req_v1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.route_update_euis_req_v1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.route_update_euis_req_v1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.nova.grpc.route_update_euis_req_v1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.route_update_euis_req_v1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.nova.grpc.route_update_euis_req_v1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.route_update_euis_req_v1 parseFrom(
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
  public static Builder newBuilder(xyz.nova.grpc.route_update_euis_req_v1 prototype) {
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
   * Protobuf type {@code helium.iot_config.route_update_euis_req_v1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helium.iot_config.route_update_euis_req_v1)
      xyz.nova.grpc.route_update_euis_req_v1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_route_update_euis_req_v1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_route_update_euis_req_v1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.nova.grpc.route_update_euis_req_v1.class, xyz.nova.grpc.route_update_euis_req_v1.Builder.class);
    }

    // Construct using xyz.nova.grpc.route_update_euis_req_v1.newBuilder()
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
      action_ = 0;
      euiPair_ = null;
      if (euiPairBuilder_ != null) {
        euiPairBuilder_.dispose();
        euiPairBuilder_ = null;
      }
      timestamp_ = 0L;
      signature_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_route_update_euis_req_v1_descriptor;
    }

    @java.lang.Override
    public xyz.nova.grpc.route_update_euis_req_v1 getDefaultInstanceForType() {
      return xyz.nova.grpc.route_update_euis_req_v1.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.nova.grpc.route_update_euis_req_v1 build() {
      xyz.nova.grpc.route_update_euis_req_v1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.nova.grpc.route_update_euis_req_v1 buildPartial() {
      xyz.nova.grpc.route_update_euis_req_v1 result = new xyz.nova.grpc.route_update_euis_req_v1(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(xyz.nova.grpc.route_update_euis_req_v1 result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.action_ = action_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.euiPair_ = euiPairBuilder_ == null
            ? euiPair_
            : euiPairBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timestamp_ = timestamp_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.signature_ = signature_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.nova.grpc.route_update_euis_req_v1) {
        return mergeFrom((xyz.nova.grpc.route_update_euis_req_v1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.nova.grpc.route_update_euis_req_v1 other) {
      if (other == xyz.nova.grpc.route_update_euis_req_v1.getDefaultInstance()) return this;
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
      }
      if (other.hasEuiPair()) {
        mergeEuiPair(other.getEuiPair());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
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
            case 8: {
              action_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getEuiPairFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              timestamp_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              signature_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int action_ = 0;
    /**
     * <code>.helium.iot_config.action_v1 action = 1;</code>
     * @return The enum numeric value on the wire for action.
     */
    @java.lang.Override public int getActionValue() {
      return action_;
    }
    /**
     * <code>.helium.iot_config.action_v1 action = 1;</code>
     * @param value The enum numeric value on the wire for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionValue(int value) {
      action_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.iot_config.action_v1 action = 1;</code>
     * @return The action.
     */
    @java.lang.Override
    public xyz.nova.grpc.action_v1 getAction() {
      xyz.nova.grpc.action_v1 result = xyz.nova.grpc.action_v1.forNumber(action_);
      return result == null ? xyz.nova.grpc.action_v1.UNRECOGNIZED : result;
    }
    /**
     * <code>.helium.iot_config.action_v1 action = 1;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(xyz.nova.grpc.action_v1 value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.helium.iot_config.action_v1 action = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      action_ = 0;
      onChanged();
      return this;
    }

    private xyz.nova.grpc.eui_pair_v1 euiPair_;
    private com.google.protobuf.SingleFieldBuilderV3<
        xyz.nova.grpc.eui_pair_v1, xyz.nova.grpc.eui_pair_v1.Builder, xyz.nova.grpc.eui_pair_v1OrBuilder> euiPairBuilder_;
    /**
     * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
     * @return Whether the euiPair field is set.
     */
    public boolean hasEuiPair() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
     * @return The euiPair.
     */
    public xyz.nova.grpc.eui_pair_v1 getEuiPair() {
      if (euiPairBuilder_ == null) {
        return euiPair_ == null ? xyz.nova.grpc.eui_pair_v1.getDefaultInstance() : euiPair_;
      } else {
        return euiPairBuilder_.getMessage();
      }
    }
    /**
     * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
     */
    public Builder setEuiPair(xyz.nova.grpc.eui_pair_v1 value) {
      if (euiPairBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        euiPair_ = value;
      } else {
        euiPairBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
     */
    public Builder setEuiPair(
        xyz.nova.grpc.eui_pair_v1.Builder builderForValue) {
      if (euiPairBuilder_ == null) {
        euiPair_ = builderForValue.build();
      } else {
        euiPairBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
     */
    public Builder mergeEuiPair(xyz.nova.grpc.eui_pair_v1 value) {
      if (euiPairBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          euiPair_ != null &&
          euiPair_ != xyz.nova.grpc.eui_pair_v1.getDefaultInstance()) {
          getEuiPairBuilder().mergeFrom(value);
        } else {
          euiPair_ = value;
        }
      } else {
        euiPairBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
     */
    public Builder clearEuiPair() {
      bitField0_ = (bitField0_ & ~0x00000002);
      euiPair_ = null;
      if (euiPairBuilder_ != null) {
        euiPairBuilder_.dispose();
        euiPairBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
     */
    public xyz.nova.grpc.eui_pair_v1.Builder getEuiPairBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEuiPairFieldBuilder().getBuilder();
    }
    /**
     * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
     */
    public xyz.nova.grpc.eui_pair_v1OrBuilder getEuiPairOrBuilder() {
      if (euiPairBuilder_ != null) {
        return euiPairBuilder_.getMessageOrBuilder();
      } else {
        return euiPair_ == null ?
            xyz.nova.grpc.eui_pair_v1.getDefaultInstance() : euiPair_;
      }
    }
    /**
     * <code>.helium.iot_config.eui_pair_v1 eui_pair = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        xyz.nova.grpc.eui_pair_v1, xyz.nova.grpc.eui_pair_v1.Builder, xyz.nova.grpc.eui_pair_v1OrBuilder> 
        getEuiPairFieldBuilder() {
      if (euiPairBuilder_ == null) {
        euiPairBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            xyz.nova.grpc.eui_pair_v1, xyz.nova.grpc.eui_pair_v1.Builder, xyz.nova.grpc.eui_pair_v1OrBuilder>(
                getEuiPair(),
                getParentForChildren(),
                isClean());
        euiPair_ = null;
      }
      return euiPairBuilder_;
    }

    private long timestamp_ ;
    /**
     * <pre>
     * in milliseconds since unix epoch
     * </pre>
     *
     * <code>uint64 timestamp = 3;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     * in milliseconds since unix epoch
     * </pre>
     *
     * <code>uint64 timestamp = 3;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * in milliseconds since unix epoch
     * </pre>
     *
     * <code>uint64 timestamp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 4;</code>
     * @return The signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 4;</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000008);
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:helium.iot_config.route_update_euis_req_v1)
  }

  // @@protoc_insertion_point(class_scope:helium.iot_config.route_update_euis_req_v1)
  private static final xyz.nova.grpc.route_update_euis_req_v1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.nova.grpc.route_update_euis_req_v1();
  }

  public static xyz.nova.grpc.route_update_euis_req_v1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<route_update_euis_req_v1>
      PARSER = new com.google.protobuf.AbstractParser<route_update_euis_req_v1>() {
    @java.lang.Override
    public route_update_euis_req_v1 parsePartialFrom(
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

  public static com.google.protobuf.Parser<route_update_euis_req_v1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<route_update_euis_req_v1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.nova.grpc.route_update_euis_req_v1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

