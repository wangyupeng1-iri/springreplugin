/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/roc/github/s0726/RePlugin/replugin-host-library/replugin-host-lib/src/main/aidl/com/qihoo360/loader/sp/IPref.aidl
 */
package com.qihoo360.loader.sp;
/**
 * @author RePlugin Team
 */
public interface IPref extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.qihoo360.loader.sp.IPref
{
private static final java.lang.String DESCRIPTOR = "com.qihoo360.loader.sp.IPref";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.qihoo360.loader.sp.IPref interface,
 * generating a proxy if needed.
 */
public static com.qihoo360.loader.sp.IPref asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.qihoo360.loader.sp.IPref))) {
return ((com.qihoo360.loader.sp.IPref)iin);
}
return new com.qihoo360.loader.sp.IPref.Stub.Proxy(obj);
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
case TRANSACTION_get:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _result = this.get(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_set:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.set(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getAll:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _result = this.getAll(_arg0);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.qihoo360.loader.sp.IPref
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
@Override public java.lang.String get(java.lang.String category, java.lang.String key, java.lang.String defValue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(category);
_data.writeString(key);
_data.writeString(defValue);
mRemote.transact(Stub.TRANSACTION_get, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void set(java.lang.String category, java.lang.String key, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(category);
_data.writeString(key);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_set, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.Bundle getAll(java.lang.String category) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(category);
mRemote.transact(Stub.TRANSACTION_getAll, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_get = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_set = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getAll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public java.lang.String get(java.lang.String category, java.lang.String key, java.lang.String defValue) throws android.os.RemoteException;
public void set(java.lang.String category, java.lang.String key, java.lang.String value) throws android.os.RemoteException;
public android.os.Bundle getAll(java.lang.String category) throws android.os.RemoteException;
}
