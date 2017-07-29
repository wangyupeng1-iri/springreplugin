/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/roc/github/s0726/RePlugin/replugin-host-library/replugin-host-lib/src/main/aidl/com/qihoo360/loader/IPluginHost.aidl
 */
package com.qihoo360.loader;
/**
 * @author RePlugin Team
 */
public interface IPluginHost extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.qihoo360.loader.IPluginHost
{
private static final java.lang.String DESCRIPTOR = "com.qihoo360.loader.IPluginHost";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.qihoo360.loader.IPluginHost interface,
 * generating a proxy if needed.
 */
public static com.qihoo360.loader.IPluginHost asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.qihoo360.loader.IPluginHost))) {
return ((com.qihoo360.loader.IPluginHost)iin);
}
return new com.qihoo360.loader.IPluginHost.Stub.Proxy(obj);
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
case TRANSACTION_installBinder:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.installBinder(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_fetchBinder:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _result = this.fetchBinder(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_fetchPersistentCookie:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.fetchPersistentCookie();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_startPluginProcess:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
com.qihoo360.loader.PluginBinderInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = com.qihoo360.loader.PluginBinderInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
com.qihoo360.loader.IPluginClient _result = this.startPluginProcess(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
if ((_arg2!=null)) {
reply.writeInt(1);
_arg2.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_attachPluginProcess:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _result = this.attachPluginProcess(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_listPlugins:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<com.qihoo360.replugin.model.PluginInfo> _result = this.listPlugins();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_regActivity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
this.regActivity(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_unregActivity:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
this.unregActivity(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_regService:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.regService(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_unregService:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.unregService(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_regPluginBinder:
{
data.enforceInterface(DESCRIPTOR);
com.qihoo360.loader.PluginBinderInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.qihoo360.loader.PluginBinderInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.regPluginBinder(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregPluginBinder:
{
data.enforceInterface(DESCRIPTOR);
com.qihoo360.loader.PluginBinderInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.qihoo360.loader.PluginBinderInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.unregPluginBinder(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_regReceiver:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.Map _arg1;
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_arg1 = data.readHashMap(cl);
this.regReceiver(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregReceiver:
{
data.enforceInterface(DESCRIPTOR);
this.unregReceiver();
reply.writeNoException();
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
case TRANSACTION_sumBinders:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.sumBinders(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_updatePluginInfo:
{
data.enforceInterface(DESCRIPTOR);
com.qihoo360.replugin.model.PluginInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.qihoo360.replugin.model.PluginInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.updatePluginInfo(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_pluginDownloaded:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.qihoo360.replugin.model.PluginInfo _result = this.pluginDownloaded(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_pluginExtracted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.pluginExtracted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_sendIntent2Process:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.sendIntent2Process(_arg0, _arg1);
return true;
}
case TRANSACTION_sendIntent2Plugin:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.sendIntent2Plugin(_arg0, _arg1);
return true;
}
case TRANSACTION_sendIntent2ProcessSync:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.sendIntent2ProcessSync(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_sendIntent2PluginSync:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.sendIntent2PluginSync(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isProcessAlive:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isProcessAlive(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_queryPluginBinder:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.IBinder _result = this.queryPluginBinder(_arg0, _arg1);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_queryPluginsReceiverList:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List _result = this.queryPluginsReceiverList(_arg0);
reply.writeNoException();
reply.writeList(_result);
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
case TRANSACTION_fetchManagerServer:
{
data.enforceInterface(DESCRIPTOR);
com.qihoo360.replugin.packages.IPluginManagerServer _result = this.fetchManagerServer();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getTaskAffinityGroupIndex:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getTaskAffinityGroupIndex(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPidByProcessName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getPidByProcessName(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getProcessNameByPid:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getProcessNameByPid(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.qihoo360.loader.IPluginHost
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
@Override public void installBinder(java.lang.String name, android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_installBinder, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.IBinder fetchBinder(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_fetchBinder, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long fetchPersistentCookie() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_fetchPersistentCookie, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.qihoo360.loader.IPluginClient startPluginProcess(java.lang.String plugin, int process, com.qihoo360.loader.PluginBinderInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.qihoo360.loader.IPluginClient _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(plugin);
_data.writeInt(process);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startPluginProcess, _data, _reply, 0);
_reply.readException();
_result = com.qihoo360.loader.IPluginClient.Stub.asInterface(_reply.readStrongBinder());
if ((0!=_reply.readInt())) {
info.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String attachPluginProcess(java.lang.String process, int index, android.os.IBinder binder, java.lang.String def) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(process);
_data.writeInt(index);
_data.writeStrongBinder(binder);
_data.writeString(def);
mRemote.transact(Stub.TRANSACTION_attachPluginProcess, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<com.qihoo360.replugin.model.PluginInfo> listPlugins() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<com.qihoo360.replugin.model.PluginInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listPlugins, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(com.qihoo360.replugin.model.PluginInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void regActivity(int index, java.lang.String plugin, java.lang.String container, java.lang.String activity) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeString(plugin);
_data.writeString(container);
_data.writeString(activity);
mRemote.transact(Stub.TRANSACTION_regActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregActivity(int index, java.lang.String plugin, java.lang.String container, java.lang.String activity) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeString(plugin);
_data.writeString(container);
_data.writeString(activity);
mRemote.transact(Stub.TRANSACTION_unregActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void regService(int index, java.lang.String plugin, java.lang.String service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeString(plugin);
_data.writeString(service);
mRemote.transact(Stub.TRANSACTION_regService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregService(int index, java.lang.String plugin, java.lang.String service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeString(plugin);
_data.writeString(service);
mRemote.transact(Stub.TRANSACTION_unregService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void regPluginBinder(com.qihoo360.loader.PluginBinderInfo info, android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_regPluginBinder, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregPluginBinder(com.qihoo360.loader.PluginBinderInfo info, android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_unregPluginBinder, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
    * 注册某插件下所有静态声明的的 receiver 到常驻进程
    */
@Override public void regReceiver(java.lang.String plugin, java.util.Map receiverFilterMap) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(plugin);
_data.writeMap(receiverFilterMap);
mRemote.transact(Stub.TRANSACTION_regReceiver, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregReceiver() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_unregReceiver, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * 插件收到广播
     *
     * @param plugin 插件名称
     * @param receiver Receiver 名称
     * @param Intent 广播的 Intent 数据
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
@Override public int sumBinders(int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_sumBinders, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void updatePluginInfo(com.qihoo360.replugin.model.PluginInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updatePluginInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.qihoo360.replugin.model.PluginInfo pluginDownloaded(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.qihoo360.replugin.model.PluginInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_pluginDownloaded, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.qihoo360.replugin.model.PluginInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean pluginExtracted(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_pluginExtracted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void sendIntent2Process(java.lang.String target, android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(target);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendIntent2Process, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sendIntent2Plugin(java.lang.String target, android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(target);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendIntent2Plugin, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void sendIntent2ProcessSync(java.lang.String target, android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(target);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendIntent2ProcessSync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendIntent2PluginSync(java.lang.String target, android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(target);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendIntent2PluginSync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isProcessAlive(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_isProcessAlive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.IBinder queryPluginBinder(java.lang.String plugin, java.lang.String binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(plugin);
_data.writeString(binder);
mRemote.transact(Stub.TRANSACTION_queryPluginBinder, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * 根据 Inent 查询所有插件中的与之匹配的 Receivers
     */
@Override public java.util.List queryPluginsReceiverList(android.content.Intent intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_queryPluginsReceiverList, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * 获取“全新Service管理方案”在Server端的服务
     * Added by Jiongxuan Zhang
     */
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
     * 获取 IPluginManagerServer（纯APK方案使用）的插件服务
     * Added by Jiongxuan Zhang
     */
@Override public com.qihoo360.replugin.packages.IPluginManagerServer fetchManagerServer() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.qihoo360.replugin.packages.IPluginManagerServer _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_fetchManagerServer, _data, _reply, 0);
_reply.readException();
_result = com.qihoo360.replugin.packages.IPluginManagerServer.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getTaskAffinityGroupIndex(java.lang.String taskAffinity) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(taskAffinity);
mRemote.transact(Stub.TRANSACTION_getTaskAffinityGroupIndex, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getPidByProcessName(java.lang.String processName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(processName);
mRemote.transact(Stub.TRANSACTION_getPidByProcessName, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * 通过PID来获取进程名
     */
@Override public java.lang.String getProcessNameByPid(int pid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(pid);
mRemote.transact(Stub.TRANSACTION_getProcessNameByPid, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_installBinder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_fetchBinder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_fetchPersistentCookie = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startPluginProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_attachPluginProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_listPlugins = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_regActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_unregActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_regService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_unregService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_regPluginBinder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_unregPluginBinder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_regReceiver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_unregReceiver = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_onReceive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_sumBinders = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_updatePluginInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_pluginDownloaded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_pluginExtracted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_sendIntent2Process = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_sendIntent2Plugin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_sendIntent2ProcessSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_sendIntent2PluginSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_isProcessAlive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_queryPluginBinder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_queryPluginsReceiverList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_fetchServiceServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_fetchManagerServer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_getTaskAffinityGroupIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_getPidByProcessName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getProcessNameByPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
}
public void installBinder(java.lang.String name, android.os.IBinder binder) throws android.os.RemoteException;
public android.os.IBinder fetchBinder(java.lang.String name) throws android.os.RemoteException;
public long fetchPersistentCookie() throws android.os.RemoteException;
public com.qihoo360.loader.IPluginClient startPluginProcess(java.lang.String plugin, int process, com.qihoo360.loader.PluginBinderInfo info) throws android.os.RemoteException;
public java.lang.String attachPluginProcess(java.lang.String process, int index, android.os.IBinder binder, java.lang.String def) throws android.os.RemoteException;
public java.util.List<com.qihoo360.replugin.model.PluginInfo> listPlugins() throws android.os.RemoteException;
public void regActivity(int index, java.lang.String plugin, java.lang.String container, java.lang.String activity) throws android.os.RemoteException;
public void unregActivity(int index, java.lang.String plugin, java.lang.String container, java.lang.String activity) throws android.os.RemoteException;
public void regService(int index, java.lang.String plugin, java.lang.String service) throws android.os.RemoteException;
public void unregService(int index, java.lang.String plugin, java.lang.String service) throws android.os.RemoteException;
public void regPluginBinder(com.qihoo360.loader.PluginBinderInfo info, android.os.IBinder binder) throws android.os.RemoteException;
public void unregPluginBinder(com.qihoo360.loader.PluginBinderInfo info, android.os.IBinder binder) throws android.os.RemoteException;
/**
    * 注册某插件下所有静态声明的的 receiver 到常驻进程
    */
public void regReceiver(java.lang.String plugin, java.util.Map receiverFilterMap) throws android.os.RemoteException;
public void unregReceiver() throws android.os.RemoteException;
/**
     * 插件收到广播
     *
     * @param plugin 插件名称
     * @param receiver Receiver 名称
     * @param Intent 广播的 Intent 数据
     */
public void onReceive(java.lang.String plugin, java.lang.String receiver, android.content.Intent intent) throws android.os.RemoteException;
public int sumBinders(int index) throws android.os.RemoteException;
public void updatePluginInfo(com.qihoo360.replugin.model.PluginInfo info) throws android.os.RemoteException;
public com.qihoo360.replugin.model.PluginInfo pluginDownloaded(java.lang.String path) throws android.os.RemoteException;
public boolean pluginExtracted(java.lang.String path) throws android.os.RemoteException;
public void sendIntent2Process(java.lang.String target, android.content.Intent intent) throws android.os.RemoteException;
public void sendIntent2Plugin(java.lang.String target, android.content.Intent intent) throws android.os.RemoteException;
public void sendIntent2ProcessSync(java.lang.String target, android.content.Intent intent) throws android.os.RemoteException;
public void sendIntent2PluginSync(java.lang.String target, android.content.Intent intent) throws android.os.RemoteException;
public boolean isProcessAlive(java.lang.String name) throws android.os.RemoteException;
public android.os.IBinder queryPluginBinder(java.lang.String plugin, java.lang.String binder) throws android.os.RemoteException;
/**
     * 根据 Inent 查询所有插件中的与之匹配的 Receivers
     */
public java.util.List queryPluginsReceiverList(android.content.Intent intent) throws android.os.RemoteException;
/**
     * 获取“全新Service管理方案”在Server端的服务
     * Added by Jiongxuan Zhang
     */
public com.qihoo360.replugin.component.service.server.IPluginServiceServer fetchServiceServer() throws android.os.RemoteException;
/**
     * 获取 IPluginManagerServer（纯APK方案使用）的插件服务
     * Added by Jiongxuan Zhang
     */
public com.qihoo360.replugin.packages.IPluginManagerServer fetchManagerServer() throws android.os.RemoteException;
public int getTaskAffinityGroupIndex(java.lang.String taskAffinity) throws android.os.RemoteException;
public int getPidByProcessName(java.lang.String processName) throws android.os.RemoteException;
/**
     * 通过PID来获取进程名
     */
public java.lang.String getProcessNameByPid(int pid) throws android.os.RemoteException;
}
