// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package xyz.nova.grpc;

public interface route_list_res_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.iot_config.route_list_res_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
   */
  java.util.List<xyz.nova.grpc.route_v1> 
      getRoutesList();
  /**
   * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
   */
  xyz.nova.grpc.route_v1 getRoutes(int index);
  /**
   * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
   */
  int getRoutesCount();
  /**
   * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
   */
  java.util.List<? extends xyz.nova.grpc.route_v1OrBuilder> 
      getRoutesOrBuilderList();
  /**
   * <code>repeated .helium.iot_config.route_v1 routes = 1;</code>
   */
  xyz.nova.grpc.route_v1OrBuilder getRoutesOrBuilder(
      int index);
}
