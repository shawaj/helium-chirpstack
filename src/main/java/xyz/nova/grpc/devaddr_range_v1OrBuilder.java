// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package xyz.nova.grpc;

public interface devaddr_range_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.devaddr_range_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string route_id = 1;</code>
   * @return The routeId.
   */
  java.lang.String getRouteId();
  /**
   * <code>string route_id = 1;</code>
   * @return The bytes for routeId.
   */
  com.google.protobuf.ByteString
      getRouteIdBytes();

  /**
   * <code>uint32 start_addr = 2;</code>
   * @return The startAddr.
   */
  int getStartAddr();

  /**
   * <code>uint32 end_addr = 3;</code>
   * @return The endAddr.
   */
  int getEndAddr();
}
