// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package xyz.nova.grpc;

public interface gateway_load_region_req_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.gateway_load_region_req_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.helium.region region = 1;</code>
   * @return The enum numeric value on the wire for region.
   */
  int getRegionValue();
  /**
   * <code>.helium.region region = 1;</code>
   * @return The region.
   */
  xyz.nova.grpc.region getRegion();

  /**
   * <code>.helium.blockchain_region_params_v1 params = 2;</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.helium.blockchain_region_params_v1 params = 2;</code>
   * @return The params.
   */
  xyz.nova.grpc.blockchain_region_params_v1 getParams();
  /**
   * <code>.helium.blockchain_region_params_v1 params = 2;</code>
   */
  xyz.nova.grpc.blockchain_region_params_v1OrBuilder getParamsOrBuilder();

  /**
   * <pre>
   * Gzip-compressed file content from converting region geojson to a list of h3
   * indexes
   * </pre>
   *
   * <code>bytes hex_indexes = 3;</code>
   * @return The hexIndexes.
   */
  com.google.protobuf.ByteString getHexIndexes();

  /**
   * <code>bytes signature = 4;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();
}
