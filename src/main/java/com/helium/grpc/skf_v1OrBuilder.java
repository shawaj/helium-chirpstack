// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package com.helium.grpc;

public interface skf_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.skf_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string route_id = 1;</code>
   * @return The routeId.
   */
  String getRouteId();
  /**
   * <code>string route_id = 1;</code>
   * @return The bytes for routeId.
   */
  com.google.protobuf.ByteString
      getRouteIdBytes();

  /**
   * <code>uint32 devaddr = 2;</code>
   * @return The devaddr.
   */
  int getDevaddr();

  /**
   * <pre>
   * the hex-encoded string of the binary session key
   * </pre>
   *
   * <code>string session_key = 3;</code>
   * @return The sessionKey.
   */
  String getSessionKey();
  /**
   * <pre>
   * the hex-encoded string of the binary session key
   * </pre>
   *
   * <code>string session_key = 3;</code>
   * @return The bytes for sessionKey.
   */
  com.google.protobuf.ByteString
      getSessionKeyBytes();
}
