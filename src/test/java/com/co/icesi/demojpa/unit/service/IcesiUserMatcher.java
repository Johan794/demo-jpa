package com.co.icesi.demojpa.unit.service;

import com.co.icesi.demojpa.model.IcesiUser;
import lombok.AllArgsConstructor;
import org.mockito.ArgumentMatcher;

import java.util.Objects;

@AllArgsConstructor
public class IcesiUserMatcher implements ArgumentMatcher<IcesiUser> {

    private IcesiUser icesiUserLeft;
    @Override
    public boolean matches(IcesiUser icesiUserRigth) {
        return icesiUserRigth.getUserID() != null &&
                Objects.equals(icesiUserRigth.getFirstName(),icesiUserLeft.getFirstName()) &&
                Objects.equals(icesiUserRigth.getLastName(),icesiUserLeft.getLastName()) &&
                Objects.equals(icesiUserRigth.getIsActive(),icesiUserLeft.getIsActive()) &&
                Objects.equals(icesiUserRigth.getEmail(), icesiUserLeft.getEmail()) &&
                Objects.equals(icesiUserRigth.getPassWord(),icesiUserLeft.getPassWord());
    }
}
