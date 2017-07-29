/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/roc/github/s0726/RePlugin/replugin-host-library/replugin-host-lib/src/main/aidl/com/qihoo360/loader/IPluginClient.aidl
 */
package com.qihoo360.loader;
/**
 * @author RePlugin Team
 */
public interface IPluginClient extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.qihoo360.loader.IPluginClient
{
private static final java.lang.String DESCRIPTOR = "com.qihoo360.loader.IPluginClient";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.qihoo360.loader.IPluginClient interface,
 * generating a proxy if needed.
 */
public static com.qihoo360.loader.IPluginClient asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.qihoo360.loader.IPluginClient))) {
return ((com.qihoo360.loader.IPluginClient)iin);
}
return new com.qihoo360.loader.IPluginClient.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_allocActivityContainer:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
android.content.Intent _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
java.lang.String _result = this.allocActivityContainer(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_queryBinder:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.IBinder _result = this.queryBinder(_arg0, _arg1);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_releaseBinder:
{
data.enforceInterface(DESCRIPTOR);
this.releaseBinder();
reply.writeNoException();
return true;
}
case TRANSACTION_sendIntent:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.sendIntent(_arg0);
return true;
}
case TRANSACTION_sendIntentSync:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.sendIntentSync(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sumActivities:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.sumActivities();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_fetchServiceServer:
{
data.enforceInterface(DESCRIPTOR);
com.qihoo360.replugin.component.service.server.IPluginServiceServer _result = this.fetchServiceServer();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_onReceive:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.content.Intent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onReceive(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.qihoo360.loader.IPluginClient
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
// 参数 plugin, process 可能有冗余，目前临时使用，后续可能优化

@Override public java.lang.String allocActivityContainer(java.lang.String plugin, int process, java.lang.String target, android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(plugin);
_data.writeInt(process);
_data.writeString(target);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_allocActivityContainer, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// 参数 plugin 用来处理多插件单进程情况

@Override public android.os.IBinder queryBinder(java.lang.String plugin, java.lang.String binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(plugin);
_data.writeString(binder);
mRemote.transact(Stub.TRANSACTION_queryBinder, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void releaseBinder() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_releaseBinder, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendIntent(android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendIntent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sendIntentSync(android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendIntentSync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int sumActivities() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_sumActivities, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.qihoo360.replugin.component.service.server.IPluginServiceServer fetchServiceServer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.qihoo360.replugin.component.service.server.IPluginServiceServer _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_fetchServiceServer, _data, _reply, 0);
_reply.readException();
_result = com.qihoo360.replugin.component.service.server.IPluginServiceServer.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * 插件收到广播
     *
     * @param plugin   插件名称
     * @param receiver Receiver 名称
     * @param Intent   广播的 Intent 数据
     */
@Override public void onReceive(java.lang.String plugin, java.lang.String receiver, android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(plugin);
_data.writeString(receiver);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onReceive, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_allocActivityContainer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_queryBinder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_releaseBinder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_sendIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_sendIntentSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_sumActivities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_fetchServiceServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onReceive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
// 参数 plugin, process 可能有冗余，目前临时使用，后续可能优化

public java.lang.String allocActivityContainer(java.lang.String plugin, int process, java.lang.String target, android.content.Intent intent) throws android.os.RemoteException;
// 参数 plugin 用来处理多插件单进程情况

public android.os.IBinder queryBinder(java.lang.String plugin, java.lang.String binder) throws android.os.RemoteException;
public void releaseBinder() throws android.os.RemoteException;
public void sendIntent(android.content.Intent intent) throws android.os.RemoteException;
public void sendIntentSync(android.content.Intent intent) throws android.os.RemoteException;
public int sumActivities() throws android.os.RemoteException;
public com.qihoo360.replugin.component.service.server.IPluginServiceServer fetchServiceServer() throws android.os.RemoteException;
/**
     * 插件收到广播
     *
     * @param plugin   插件名称
     * @param receiver Receiver 名称
     * @param Intent   广播的 Intent 数据
     */
public void onReceive(java.lang.String plugin, java.lang.String receiver, android.content.Intent intent) throws android.os.RemoteException;
}
