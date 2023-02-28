// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package xyz.nova.grpc;

public interface org_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.org_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 oui = 1;</code>
   * @return The oui.
   */
  long getOui();

  /**
   * <pre>
   * Org admin key
   * </pre>
   *
   * <code>bytes owner = 2;</code>
   * @return The owner.
   */
  com.google.protobuf.ByteString getOwner();

  /**
   * <pre>
   * Key only used for DC payments
   * </pre>
   *
   * <code>bytes payer = 3;</code>
   * @return The payer.
   */
  com.google.protobuf.ByteString getPayer();

  /**
   * <pre>
   * List of keys allowed some specific actions, see services.
   * </pre>
   *
   * <code>repeated bytes delegate_keys = 4;</code>
   * @return A list containing the delegateKeys.
   */
  java.util.List<com.google.protobuf.ByteString> getDelegateKeysList();
  /**
   * <pre>
   * List of keys allowed some specific actions, see services.
   * </pre>
   *
   * <code>repeated bytes delegate_keys = 4;</code>
   * @return The count of delegateKeys.
   */
  int getDelegateKeysCount();
  /**
   * <pre>
   * List of keys allowed some specific actions, see services.
   * </pre>
   *
   * <code>repeated bytes delegate_keys = 4;</code>
   * @param index The index of the element to return.
   * @return The delegateKeys at the given index.
   */
  com.google.protobuf.ByteString getDelegateKeys(int index);

  /**
   * <pre>
   * Is org locked because of no payment
   * </pre>
   *
   * <code>bool locked = 5;</code>
   * @return The locked.
   */
  boolean getLocked();
}
