// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package xyz.nova.grpc;

public interface org_enable_req_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.org_enable_req_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 oui = 1;</code>
   * @return The oui.
   */
  long getOui();

  /**
   * <pre>
   * in milliseconds since unix epoch
   * </pre>
   *
   * <code>uint64 timestamp = 2;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>bytes signature = 3;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();
}
