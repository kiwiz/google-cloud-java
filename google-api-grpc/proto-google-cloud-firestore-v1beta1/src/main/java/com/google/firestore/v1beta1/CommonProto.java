// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/common.proto

package com.google.firestore.v1beta1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_DocumentMask_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_DocumentMask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_Precondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_Precondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_TransactionOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_TransactionOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_TransactionOptions_ReadWrite_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_TransactionOptions_ReadWrite_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_TransactionOptions_ReadOnly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_TransactionOptions_ReadOnly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/firestore/v1beta1/common.proto\022"
          + "\030google.firestore.v1beta1\032\037google/protob"
          + "uf/timestamp.proto\032\034google/api/annotatio"
          + "ns.proto\"#\n\014DocumentMask\022\023\n\013field_paths\030"
          + "\001 \003(\t\"e\n\014Precondition\022\020\n\006exists\030\001 \001(\010H\000\022"
          + "1\n\013update_time\030\002 \001(\0132\032.google.protobuf.T"
          + "imestampH\000B\020\n\016condition_type\"\263\002\n\022Transac"
          + "tionOptions\022J\n\tread_only\030\002 \001(\01325.google."
          + "firestore.v1beta1.TransactionOptions.Rea"
          + "dOnlyH\000\022L\n\nread_write\030\003 \001(\01326.google.fir"
          + "estore.v1beta1.TransactionOptions.ReadWr"
          + "iteH\000\032&\n\tReadWrite\022\031\n\021retry_transaction\030"
          + "\001 \001(\014\032S\n\010ReadOnly\022/\n\tread_time\030\002 \001(\0132\032.g"
          + "oogle.protobuf.TimestampH\000B\026\n\024consistenc"
          + "y_selectorB\006\n\004modeB\271\001\n\034com.google.firest"
          + "ore.v1beta1B\013CommonProtoP\001ZAgoogle.golan"
          + "g.org/genproto/googleapis/firestore/v1be"
          + "ta1;firestore\242\002\004GCFS\252\002\036Google.Cloud.Fire"
          + "store.V1Beta1\312\002\036Google\\Cloud\\Firestore\\V"
          + "1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_firestore_v1beta1_DocumentMask_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_v1beta1_DocumentMask_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_DocumentMask_descriptor,
            new java.lang.String[] {
              "FieldPaths",
            });
    internal_static_google_firestore_v1beta1_Precondition_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_v1beta1_Precondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_Precondition_descriptor,
            new java.lang.String[] {
              "Exists", "UpdateTime", "ConditionType",
            });
    internal_static_google_firestore_v1beta1_TransactionOptions_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_v1beta1_TransactionOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_TransactionOptions_descriptor,
            new java.lang.String[] {
              "ReadOnly", "ReadWrite", "Mode",
            });
    internal_static_google_firestore_v1beta1_TransactionOptions_ReadWrite_descriptor =
        internal_static_google_firestore_v1beta1_TransactionOptions_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_firestore_v1beta1_TransactionOptions_ReadWrite_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_TransactionOptions_ReadWrite_descriptor,
            new java.lang.String[] {
              "RetryTransaction",
            });
    internal_static_google_firestore_v1beta1_TransactionOptions_ReadOnly_descriptor =
        internal_static_google_firestore_v1beta1_TransactionOptions_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_firestore_v1beta1_TransactionOptions_ReadOnly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_TransactionOptions_ReadOnly_descriptor,
            new java.lang.String[] {
              "ReadTime", "ConsistencySelector",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
