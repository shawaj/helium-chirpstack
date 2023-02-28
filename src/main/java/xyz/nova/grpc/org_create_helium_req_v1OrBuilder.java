// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package xyz.nova.grpc;

public interface org_create_helium_req_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.org_create_helium_req_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes owner = 1;</code>
   * @return The owner.
   */
  com.google.protobuf.ByteString getOwner();

  /**
   * <code>bytes payer = 2;</code>
   * @return The payer.
   */
  com.google.protobuf.ByteString getPayer();

  /**
   * <pre>
   * Number of device address needed
   * </pre>
   *
   * <code>uint64 devaddrs = 3;</code>
   * @return The devaddrs.
   */
  long getDevaddrs();

  /**
   * <pre>
   * in milliseconds since unix epoch
   * </pre>
   *
   * <code>uint64 timestamp = 4;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>bytes signature = 5;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   * <code>repeated bytes delegate_keys = 6;</code>
   * @return A list containing the delegateKeys.
   */
  java.util.List<com.google.protobuf.ByteString> getDelegateKeysList();
  /**
   * <code>repeated bytes delegate_keys = 6;</code>
   * @return The count of delegateKeys.
   */
  int getDelegateKeysCount();
  /**
   * <code>repeated bytes delegate_keys = 6;</code>
   * @param index The index of the element to return.
   * @return The delegateKeys at the given index.
   */
  com.google.protobuf.ByteString getDelegateKeys(int index);
}
