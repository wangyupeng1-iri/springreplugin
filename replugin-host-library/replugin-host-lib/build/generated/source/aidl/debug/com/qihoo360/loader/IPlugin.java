/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/roc/github/s0726/RePlugin/replugin-host-library/replugin-host-lib/src/main/aidl/com/qihoo360/loader/IPlugin.aidl
 */
package com.qihoo360.loader;
/**
 * @author RePlugin Team
 */
public interface IPlugin extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.qihoo360.loader.IPlugin
{
private static final java.lang.String DESCRIPTOR = "com.qihoo360.loader.IPlugin";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.qihoo360.loader.IPlugin interface,
 * generating a proxy if needed.
 */
public static com.qihoo360.loader.IPlugin asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.qihoo360.loader.IPlugin))) {
return ((com.qihoo360.loader.IPlugin)iin);
}
return new com.qihoo360.loader.IPlugin.Stub.Proxy(obj);
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
case TRANSACTION_query:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _result = this.query(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.qihoo360.loader.IPlugin
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
@Override public android.os.IBinder query(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_query, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_query = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public android.os.IBinder query(java.lang.String name) throws android.os.RemoteException;
}
