// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package xyz.nova.grpc;

/**
 * Protobuf type {@code helium.iot_config.org_res_v1}
 */
public final class org_res_v1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helium.iot_config.org_res_v1)
    org_res_v1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use org_res_v1.newBuilder() to construct.
  private org_res_v1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private org_res_v1() {
    devaddrConstraints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new org_res_v1();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_org_res_v1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_org_res_v1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.nova.grpc.org_res_v1.class, xyz.nova.grpc.org_res_v1.Builder.class);
  }

  public static final int ORG_FIELD_NUMBER = 1;
  private xyz.nova.grpc.org_v1 org_;
  /**
   * <code>.helium.iot_config.org_v1 org = 1;</code>
   * @return Whether the org field is set.
   */
  @java.lang.Override
  public boolean hasOrg() {
    return org_ != null;
  }
  /**
   * <code>.helium.iot_config.org_v1 org = 1;</code>
   * @return The org.
   */
  @java.lang.Override
  public xyz.nova.grpc.org_v1 getOrg() {
    return org_ == null ? xyz.nova.grpc.org_v1.getDefaultInstance() : org_;
  }
  /**
   * <code>.helium.iot_config.org_v1 org = 1;</code>
   */
  @java.lang.Override
  public xyz.nova.grpc.org_v1OrBuilder getOrgOrBuilder() {
    return org_ == null ? xyz.nova.grpc.org_v1.getDefaultInstance() : org_;
  }

  public static final int NET_ID_FIELD_NUMBER = 2;
  private int netId_ = 0;
  /**
   * <code>uint32 net_id = 2;</code>
   * @return The netId.
   */
  @java.lang.Override
  public int getNetId() {
    return netId_;
  }

  public static final int DEVADDR_CONSTRAINTS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<xyz.nova.grpc.devaddr_constraint_v1> devaddrConstraints_;
  /**
   * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
   */
  @java.lang.Override
  public java.util.List<xyz.nova.grpc.devaddr_constraint_v1> getDevaddrConstraintsList() {
    return devaddrConstraints_;
  }
  /**
   * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends xyz.nova.grpc.devaddr_constraint_v1OrBuilder> 
      getDevaddrConstraintsOrBuilderList() {
    return devaddrConstraints_;
  }
  /**
   * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
   */
  @java.lang.Override
  public int getDevaddrConstraintsCount() {
    return devaddrConstraints_.size();
  }
  /**
   * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
   */
  @java.lang.Override
  public xyz.nova.grpc.devaddr_constraint_v1 getDevaddrConstraints(int index) {
    return devaddrConstraints_.get(index);
  }
  /**
   * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
   */
  @java.lang.Override
  public xyz.nova.grpc.devaddr_constraint_v1OrBuilder getDevaddrConstraintsOrBuilder(
      int index) {
    return devaddrConstraints_.get(index);
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
    if (org_ != null) {
      output.writeMessage(1, getOrg());
    }
    if (netId_ != 0) {
      output.writeUInt32(2, netId_);
    }
    for (int i = 0; i < devaddrConstraints_.size(); i++) {
      output.writeMessage(3, devaddrConstraints_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (org_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOrg());
    }
    if (netId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, netId_);
    }
    for (int i = 0; i < devaddrConstraints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, devaddrConstraints_.get(i));
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
    if (!(obj instanceof xyz.nova.grpc.org_res_v1)) {
      return super.equals(obj);
    }
    xyz.nova.grpc.org_res_v1 other = (xyz.nova.grpc.org_res_v1) obj;

    if (hasOrg() != other.hasOrg()) return false;
    if (hasOrg()) {
      if (!getOrg()
          .equals(other.getOrg())) return false;
    }
    if (getNetId()
        != other.getNetId()) return false;
    if (!getDevaddrConstraintsList()
        .equals(other.getDevaddrConstraintsList())) return false;
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
    if (hasOrg()) {
      hash = (37 * hash) + ORG_FIELD_NUMBER;
      hash = (53 * hash) + getOrg().hashCode();
    }
    hash = (37 * hash) + NET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNetId();
    if (getDevaddrConstraintsCount() > 0) {
      hash = (37 * hash) + DEVADDR_CONSTRAINTS_FIELD_NUMBER;
      hash = (53 * hash) + getDevaddrConstraintsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.nova.grpc.org_res_v1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.org_res_v1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.org_res_v1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.org_res_v1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.org_res_v1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.org_res_v1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.org_res_v1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.org_res_v1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.nova.grpc.org_res_v1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.org_res_v1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.nova.grpc.org_res_v1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.org_res_v1 parseFrom(
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
  public static Builder newBuilder(xyz.nova.grpc.org_res_v1 prototype) {
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
   * Protobuf type {@code helium.iot_config.org_res_v1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helium.iot_config.org_res_v1)
      xyz.nova.grpc.org_res_v1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_org_res_v1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_org_res_v1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.nova.grpc.org_res_v1.class, xyz.nova.grpc.org_res_v1.Builder.class);
    }

    // Construct using xyz.nova.grpc.org_res_v1.newBuilder()
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
      org_ = null;
      if (orgBuilder_ != null) {
        orgBuilder_.dispose();
        orgBuilder_ = null;
      }
      netId_ = 0;
      if (devaddrConstraintsBuilder_ == null) {
        devaddrConstraints_ = java.util.Collections.emptyList();
      } else {
        devaddrConstraints_ = null;
        devaddrConstraintsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_org_res_v1_descriptor;
    }

    @java.lang.Override
    public xyz.nova.grpc.org_res_v1 getDefaultInstanceForType() {
      return xyz.nova.grpc.org_res_v1.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.nova.grpc.org_res_v1 build() {
      xyz.nova.grpc.org_res_v1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.nova.grpc.org_res_v1 buildPartial() {
      xyz.nova.grpc.org_res_v1 result = new xyz.nova.grpc.org_res_v1(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(xyz.nova.grpc.org_res_v1 result) {
      if (devaddrConstraintsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          devaddrConstraints_ = java.util.Collections.unmodifiableList(devaddrConstraints_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.devaddrConstraints_ = devaddrConstraints_;
      } else {
        result.devaddrConstraints_ = devaddrConstraintsBuilder_.build();
      }
    }

    private void buildPartial0(xyz.nova.grpc.org_res_v1 result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.org_ = orgBuilder_ == null
            ? org_
            : orgBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.netId_ = netId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.nova.grpc.org_res_v1) {
        return mergeFrom((xyz.nova.grpc.org_res_v1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.nova.grpc.org_res_v1 other) {
      if (other == xyz.nova.grpc.org_res_v1.getDefaultInstance()) return this;
      if (other.hasOrg()) {
        mergeOrg(other.getOrg());
      }
      if (other.getNetId() != 0) {
        setNetId(other.getNetId());
      }
      if (devaddrConstraintsBuilder_ == null) {
        if (!other.devaddrConstraints_.isEmpty()) {
          if (devaddrConstraints_.isEmpty()) {
            devaddrConstraints_ = other.devaddrConstraints_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureDevaddrConstraintsIsMutable();
            devaddrConstraints_.addAll(other.devaddrConstraints_);
          }
          onChanged();
        }
      } else {
        if (!other.devaddrConstraints_.isEmpty()) {
          if (devaddrConstraintsBuilder_.isEmpty()) {
            devaddrConstraintsBuilder_.dispose();
            devaddrConstraintsBuilder_ = null;
            devaddrConstraints_ = other.devaddrConstraints_;
            bitField0_ = (bitField0_ & ~0x00000004);
            devaddrConstraintsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDevaddrConstraintsFieldBuilder() : null;
          } else {
            devaddrConstraintsBuilder_.addAllMessages(other.devaddrConstraints_);
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
              input.readMessage(
                  getOrgFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              netId_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              xyz.nova.grpc.devaddr_constraint_v1 m =
                  input.readMessage(
                      xyz.nova.grpc.devaddr_constraint_v1.parser(),
                      extensionRegistry);
              if (devaddrConstraintsBuilder_ == null) {
                ensureDevaddrConstraintsIsMutable();
                devaddrConstraints_.add(m);
              } else {
                devaddrConstraintsBuilder_.addMessage(m);
              }
              break;
            } // case 26
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

    private xyz.nova.grpc.org_v1 org_;
    private com.google.protobuf.SingleFieldBuilderV3<
        xyz.nova.grpc.org_v1, xyz.nova.grpc.org_v1.Builder, xyz.nova.grpc.org_v1OrBuilder> orgBuilder_;
    /**
     * <code>.helium.iot_config.org_v1 org = 1;</code>
     * @return Whether the org field is set.
     */
    public boolean hasOrg() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.helium.iot_config.org_v1 org = 1;</code>
     * @return The org.
     */
    public xyz.nova.grpc.org_v1 getOrg() {
      if (orgBuilder_ == null) {
        return org_ == null ? xyz.nova.grpc.org_v1.getDefaultInstance() : org_;
      } else {
        return orgBuilder_.getMessage();
      }
    }
    /**
     * <code>.helium.iot_config.org_v1 org = 1;</code>
     */
    public Builder setOrg(xyz.nova.grpc.org_v1 value) {
      if (orgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        org_ = value;
      } else {
        orgBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.iot_config.org_v1 org = 1;</code>
     */
    public Builder setOrg(
        xyz.nova.grpc.org_v1.Builder builderForValue) {
      if (orgBuilder_ == null) {
        org_ = builderForValue.build();
      } else {
        orgBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.iot_config.org_v1 org = 1;</code>
     */
    public Builder mergeOrg(xyz.nova.grpc.org_v1 value) {
      if (orgBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          org_ != null &&
          org_ != xyz.nova.grpc.org_v1.getDefaultInstance()) {
          getOrgBuilder().mergeFrom(value);
        } else {
          org_ = value;
        }
      } else {
        orgBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.iot_config.org_v1 org = 1;</code>
     */
    public Builder clearOrg() {
      bitField0_ = (bitField0_ & ~0x00000001);
      org_ = null;
      if (orgBuilder_ != null) {
        orgBuilder_.dispose();
        orgBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.helium.iot_config.org_v1 org = 1;</code>
     */
    public xyz.nova.grpc.org_v1.Builder getOrgBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOrgFieldBuilder().getBuilder();
    }
    /**
     * <code>.helium.iot_config.org_v1 org = 1;</code>
     */
    public xyz.nova.grpc.org_v1OrBuilder getOrgOrBuilder() {
      if (orgBuilder_ != null) {
        return orgBuilder_.getMessageOrBuilder();
      } else {
        return org_ == null ?
            xyz.nova.grpc.org_v1.getDefaultInstance() : org_;
      }
    }
    /**
     * <code>.helium.iot_config.org_v1 org = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        xyz.nova.grpc.org_v1, xyz.nova.grpc.org_v1.Builder, xyz.nova.grpc.org_v1OrBuilder> 
        getOrgFieldBuilder() {
      if (orgBuilder_ == null) {
        orgBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            xyz.nova.grpc.org_v1, xyz.nova.grpc.org_v1.Builder, xyz.nova.grpc.org_v1OrBuilder>(
                getOrg(),
                getParentForChildren(),
                isClean());
        org_ = null;
      }
      return orgBuilder_;
    }

    private int netId_ ;
    /**
     * <code>uint32 net_id = 2;</code>
     * @return The netId.
     */
    @java.lang.Override
    public int getNetId() {
      return netId_;
    }
    /**
     * <code>uint32 net_id = 2;</code>
     * @param value The netId to set.
     * @return This builder for chaining.
     */
    public Builder setNetId(int value) {

      netId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 net_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNetId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      netId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<xyz.nova.grpc.devaddr_constraint_v1> devaddrConstraints_ =
      java.util.Collections.emptyList();
    private void ensureDevaddrConstraintsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        devaddrConstraints_ = new java.util.ArrayList<xyz.nova.grpc.devaddr_constraint_v1>(devaddrConstraints_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        xyz.nova.grpc.devaddr_constraint_v1, xyz.nova.grpc.devaddr_constraint_v1.Builder, xyz.nova.grpc.devaddr_constraint_v1OrBuilder> devaddrConstraintsBuilder_;

    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public java.util.List<xyz.nova.grpc.devaddr_constraint_v1> getDevaddrConstraintsList() {
      if (devaddrConstraintsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(devaddrConstraints_);
      } else {
        return devaddrConstraintsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public int getDevaddrConstraintsCount() {
      if (devaddrConstraintsBuilder_ == null) {
        return devaddrConstraints_.size();
      } else {
        return devaddrConstraintsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public xyz.nova.grpc.devaddr_constraint_v1 getDevaddrConstraints(int index) {
      if (devaddrConstraintsBuilder_ == null) {
        return devaddrConstraints_.get(index);
      } else {
        return devaddrConstraintsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public Builder setDevaddrConstraints(
        int index, xyz.nova.grpc.devaddr_constraint_v1 value) {
      if (devaddrConstraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevaddrConstraintsIsMutable();
        devaddrConstraints_.set(index, value);
        onChanged();
      } else {
        devaddrConstraintsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public Builder setDevaddrConstraints(
        int index, xyz.nova.grpc.devaddr_constraint_v1.Builder builderForValue) {
      if (devaddrConstraintsBuilder_ == null) {
        ensureDevaddrConstraintsIsMutable();
        devaddrConstraints_.set(index, builderForValue.build());
        onChanged();
      } else {
        devaddrConstraintsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public Builder addDevaddrConstraints(xyz.nova.grpc.devaddr_constraint_v1 value) {
      if (devaddrConstraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevaddrConstraintsIsMutable();
        devaddrConstraints_.add(value);
        onChanged();
      } else {
        devaddrConstraintsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public Builder addDevaddrConstraints(
        int index, xyz.nova.grpc.devaddr_constraint_v1 value) {
      if (devaddrConstraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevaddrConstraintsIsMutable();
        devaddrConstraints_.add(index, value);
        onChanged();
      } else {
        devaddrConstraintsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public Builder addDevaddrConstraints(
        xyz.nova.grpc.devaddr_constraint_v1.Builder builderForValue) {
      if (devaddrConstraintsBuilder_ == null) {
        ensureDevaddrConstraintsIsMutable();
        devaddrConstraints_.add(builderForValue.build());
        onChanged();
      } else {
        devaddrConstraintsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public Builder addDevaddrConstraints(
        int index, xyz.nova.grpc.devaddr_constraint_v1.Builder builderForValue) {
      if (devaddrConstraintsBuilder_ == null) {
        ensureDevaddrConstraintsIsMutable();
        devaddrConstraints_.add(index, builderForValue.build());
        onChanged();
      } else {
        devaddrConstraintsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public Builder addAllDevaddrConstraints(
        java.lang.Iterable<? extends xyz.nova.grpc.devaddr_constraint_v1> values) {
      if (devaddrConstraintsBuilder_ == null) {
        ensureDevaddrConstraintsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, devaddrConstraints_);
        onChanged();
      } else {
        devaddrConstraintsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public Builder clearDevaddrConstraints() {
      if (devaddrConstraintsBuilder_ == null) {
        devaddrConstraints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        devaddrConstraintsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public Builder removeDevaddrConstraints(int index) {
      if (devaddrConstraintsBuilder_ == null) {
        ensureDevaddrConstraintsIsMutable();
        devaddrConstraints_.remove(index);
        onChanged();
      } else {
        devaddrConstraintsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public xyz.nova.grpc.devaddr_constraint_v1.Builder getDevaddrConstraintsBuilder(
        int index) {
      return getDevaddrConstraintsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public xyz.nova.grpc.devaddr_constraint_v1OrBuilder getDevaddrConstraintsOrBuilder(
        int index) {
      if (devaddrConstraintsBuilder_ == null) {
        return devaddrConstraints_.get(index);  } else {
        return devaddrConstraintsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public java.util.List<? extends xyz.nova.grpc.devaddr_constraint_v1OrBuilder> 
         getDevaddrConstraintsOrBuilderList() {
      if (devaddrConstraintsBuilder_ != null) {
        return devaddrConstraintsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(devaddrConstraints_);
      }
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public xyz.nova.grpc.devaddr_constraint_v1.Builder addDevaddrConstraintsBuilder() {
      return getDevaddrConstraintsFieldBuilder().addBuilder(
          xyz.nova.grpc.devaddr_constraint_v1.getDefaultInstance());
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public xyz.nova.grpc.devaddr_constraint_v1.Builder addDevaddrConstraintsBuilder(
        int index) {
      return getDevaddrConstraintsFieldBuilder().addBuilder(
          index, xyz.nova.grpc.devaddr_constraint_v1.getDefaultInstance());
    }
    /**
     * <code>repeated .helium.iot_config.devaddr_constraint_v1 devaddr_constraints = 3;</code>
     */
    public java.util.List<xyz.nova.grpc.devaddr_constraint_v1.Builder> 
         getDevaddrConstraintsBuilderList() {
      return getDevaddrConstraintsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        xyz.nova.grpc.devaddr_constraint_v1, xyz.nova.grpc.devaddr_constraint_v1.Builder, xyz.nova.grpc.devaddr_constraint_v1OrBuilder> 
        getDevaddrConstraintsFieldBuilder() {
      if (devaddrConstraintsBuilder_ == null) {
        devaddrConstraintsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            xyz.nova.grpc.devaddr_constraint_v1, xyz.nova.grpc.devaddr_constraint_v1.Builder, xyz.nova.grpc.devaddr_constraint_v1OrBuilder>(
                devaddrConstraints_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        devaddrConstraints_ = null;
      }
      return devaddrConstraintsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:helium.iot_config.org_res_v1)
  }

  // @@protoc_insertion_point(class_scope:helium.iot_config.org_res_v1)
  private static final xyz.nova.grpc.org_res_v1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.nova.grpc.org_res_v1();
  }

  public static xyz.nova.grpc.org_res_v1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<org_res_v1>
      PARSER = new com.google.protobuf.AbstractParser<org_res_v1>() {
    @java.lang.Override
    public org_res_v1 parsePartialFrom(
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

  public static com.google.protobuf.Parser<org_res_v1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<org_res_v1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.nova.grpc.org_res_v1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

