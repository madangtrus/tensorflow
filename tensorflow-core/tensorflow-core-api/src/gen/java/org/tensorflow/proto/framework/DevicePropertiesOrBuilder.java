// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/device_properties.proto

package org.tensorflow.proto.framework;

public interface DevicePropertiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.DeviceProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Device type (CPU, GPU, ...)
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * Device type (CPU, GPU, ...)
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Vendor (Intel, nvidia, ...)
   * </pre>
   *
   * <code>string vendor = 2;</code>
   */
  java.lang.String getVendor();
  /**
   * <pre>
   * Vendor (Intel, nvidia, ...)
   * </pre>
   *
   * <code>string vendor = 2;</code>
   */
  com.google.protobuf.ByteString
      getVendorBytes();

  /**
   * <pre>
   * Model (Haswell, K40, ...)
   * </pre>
   *
   * <code>string model = 3;</code>
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Model (Haswell, K40, ...)
   * </pre>
   *
   * <code>string model = 3;</code>
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <pre>
   * Core Frequency in Mhz
   * </pre>
   *
   * <code>int64 frequency = 4;</code>
   */
  long getFrequency();

  /**
   * <pre>
   * Number of cores
   * </pre>
   *
   * <code>int64 num_cores = 5;</code>
   */
  long getNumCores();

  /**
   * <pre>
   * Version of the tools and libraries used with this device (e.g. gcc 4.9,
   * cudnn 5.1)
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment = 6;</code>
   */
  int getEnvironmentCount();
  /**
   * <pre>
   * Version of the tools and libraries used with this device (e.g. gcc 4.9,
   * cudnn 5.1)
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment = 6;</code>
   */
  boolean containsEnvironment(
      java.lang.String key);
  /**
   * Use {@link #getEnvironmentMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getEnvironment();
  /**
   * <pre>
   * Version of the tools and libraries used with this device (e.g. gcc 4.9,
   * cudnn 5.1)
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getEnvironmentMap();
  /**
   * <pre>
   * Version of the tools and libraries used with this device (e.g. gcc 4.9,
   * cudnn 5.1)
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment = 6;</code>
   */

  java.lang.String getEnvironmentOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Version of the tools and libraries used with this device (e.g. gcc 4.9,
   * cudnn 5.1)
   * </pre>
   *
   * <code>map&lt;string, string&gt; environment = 6;</code>
   */

  java.lang.String getEnvironmentOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Number of registers per core.
   * </pre>
   *
   * <code>int64 num_registers = 7;</code>
   */
  long getNumRegisters();

  /**
   * <pre>
   * L1 cache size in bytes
   * </pre>
   *
   * <code>int64 l1_cache_size = 8;</code>
   */
  long getL1CacheSize();

  /**
   * <pre>
   * L2 cache size in bytes
   * </pre>
   *
   * <code>int64 l2_cache_size = 9;</code>
   */
  long getL2CacheSize();

  /**
   * <pre>
   * L3 cache size in bytes
   * </pre>
   *
   * <code>int64 l3_cache_size = 10;</code>
   */
  long getL3CacheSize();

  /**
   * <pre>
   * Shared memory size per multiprocessor in bytes. This field is
   * applicable to GPUs only.
   * </pre>
   *
   * <code>int64 shared_memory_size_per_multiprocessor = 11;</code>
   */
  long getSharedMemorySizePerMultiprocessor();

  /**
   * <pre>
   * Memory size in bytes
   * </pre>
   *
   * <code>int64 memory_size = 12;</code>
   */
  long getMemorySize();

  /**
   * <pre>
   * Memory bandwidth in KB/s
   * </pre>
   *
   * <code>int64 bandwidth = 13;</code>
   */
  long getBandwidth();
}
