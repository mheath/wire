/**
 * Code generated by Wire protobuf compiler, do not edit.
 * Source file: ../wire-runtime/src/test/proto/person.proto
 */
package com.squareup.wire.protos.person;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;
import com.squareup.wire.Wire;
import java.util.Collections;
import java.util.List;

public final class Person extends Message {

  public static final String DEFAULT_NAME = "";
  public static final Integer DEFAULT_ID = 0;
  public static final String DEFAULT_EMAIL = "";
  public static final List<PhoneNumber> DEFAULT_PHONE = Collections.emptyList();

  @ProtoField(
    tag = 1,
    type = Wire.STRING,
    label = Wire.REQUIRED
  )
  public final String name;

  @ProtoField(
    tag = 2,
    type = Wire.INT32,
    label = Wire.REQUIRED
  )
  public final Integer id;

  @ProtoField(
    tag = 3,
    type = Wire.STRING
  )
  public final String email;

  @ProtoField(
    tag = 4,
    label = Wire.REPEATED
  )
  public final List<PhoneNumber> phone;

  private Person(Builder builder) {
    super(builder);
    this.name = builder.name;
    this.id = builder.id;
    this.email = builder.email;
    this.phone = Wire.unmodifiableCopyOf(builder.phone);
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Person)) return false;
    Person o = (Person) other;
    if (!Wire.equals(name, o.name)) return false;
    if (!Wire.equals(id, o.id)) return false;
    if (!Wire.equals(email, o.email)) return false;
    if (!Wire.equals(phone, o.phone)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (hashCode == 0) {
      int result = name != null ? name.hashCode() : 0;
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (email != null ? email.hashCode() : 0);
      result = result * 37 + (phone != null ? phone.hashCode() : 0);
      hashCode = result;
    }
    return hashCode;
  }

  public static final class Builder extends Message.Builder<Person> {

    public String name;
    public Integer id;
    public String email;
    public List<PhoneNumber> phone;

    public Builder() {
    }

    public Builder(Person message) {
      super(message);
      if (message == null) return;
      this.name = message.name;
      this.id = message.id;
      this.email = message.email;
      this.phone = Wire.copyOf(message.phone);
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder phone(List<PhoneNumber> phone) {
      this.phone = phone;
      return this;
    }

    @Override
    public boolean isInitialized() {
      if (name == null) return false;
      if (id == null) return false;
      return true;
    }

    @Override
    public Person build() {
      if (!isInitialized()) throw new IllegalStateException("!isInitialized");
      return new Person(this);
    }
  }

  public enum PhoneType {
    @ProtoEnum(0)
    MOBILE,
    @ProtoEnum(1)
    HOME,
    @ProtoEnum(2)
    WORK,
  }

  public static final class PhoneNumber extends Message {

    public static final String DEFAULT_NUMBER = "";
    public static final PhoneType DEFAULT_TYPE = PhoneType.HOME;

    @ProtoField(
      tag = 1,
      type = Wire.STRING,
      label = Wire.REQUIRED
    )
    public final String number;

    @ProtoField(
      tag = 2,
      type = Wire.ENUM
    )
    public final PhoneType type;

    private PhoneNumber(Builder builder) {
      super(builder);
      this.number = builder.number;
      this.type = builder.type;
    }

    @Override
    public boolean equals(Object other) {
      if (!(other instanceof PhoneNumber)) return false;
      PhoneNumber o = (PhoneNumber) other;
      if (!Wire.equals(number, o.number)) return false;
      if (!Wire.equals(type, o.type)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (hashCode == 0) {
        int result = number != null ? number.hashCode() : 0;
        result = result * 37 + (type != null ? type.hashCode() : 0);
        hashCode = result;
      }
      return hashCode;
    }

    public static final class Builder extends Message.Builder<PhoneNumber> {

      public String number;
      public PhoneType type;

      public Builder() {
      }

      public Builder(PhoneNumber message) {
        super(message);
        if (message == null) return;
        this.number = message.number;
        this.type = message.type;
      }

      public Builder number(String number) {
        this.number = number;
        return this;
      }

      public Builder type(PhoneType type) {
        this.type = type;
        return this;
      }

      @Override
      public boolean isInitialized() {
        if (number == null) return false;
        return true;
      }

      @Override
      public PhoneNumber build() {
        if (!isInitialized()) throw new IllegalStateException("!isInitialized");
        return new PhoneNumber(this);
      }
    }
  }
}
