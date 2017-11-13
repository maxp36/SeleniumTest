package com.maxpyatov.tps.pages;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

@Name("Private menu")
//@FindBy(css = "div.ui.inverted.secondary.menu")
@FindBy(css = ".menu-position-styles")
public class PrivateMenu extends HtmlElement {

    @Name("Organization management dropdown menu item")
    @FindBy(css = "div.dropdown:nth-child(2)")
    private HtmlElement organizationManagementDropdownMenu;

    @Name("Profile menu item")
    @FindBy(linkText = "Профиль")
    private Link profileMenuItem;

    @Name("Users menu item")
    @FindBy(linkText = "Пользователи")
    private Link usersMenuItem;

    @Name("Manage appointments menu item")
    @FindBy(linkText = "Управление назначениями")
    private Link manageAppointmentsMenuItem;

    @Name("Documents archive menu item")
    @FindBy(linkText = "Архив документов")
    private Link documentsArchiveMenuItem;


    @Name("Documents dropdown menu item")
    @FindBy(css = "div.ui:nth-child(3)")
    private HtmlElement docsDropdownMenu;

    @Name("LCG codes menu item")
    @FindBy(linkText = "Справочник кодов ЛКГ")
    private Link LCGCodesMenuItem;

    @Name("Route passport menu item")
    @FindBy(linkText = "Электронный паспорт маршрута")
    private Link routePassportMenuItem;

    @Name("Ticket types menu item")
    @FindBy(linkText = "Справочник типов билетов")
    private Link ticketTypesMenuItem;

    @Name("Loyalty systems menu item")
    @FindBy(linkText = "Справочник систем лояльности")
    private Link loyaltySystemsMenuItem;

    @Name("Social register menu item")
    @FindBy(linkText = "Социальный реестр")
    private Link socialRegisterMenuItem;


    @Name("Documents approval menu item")
    @FindBy(linkText = "Утверждение документов")
    private Link documentsApprovalMenuItem;

    @Name("Notification menu item")
    @FindBy(css = "a.icon:nth-child(1)")
    private Link notificationMenuItem;

    @Name("Task menu item")
    @FindBy(css = "a.icon:nth-child(2)")
    private Link taskMenuItem;

    @Name("Logout menu item")
    @FindBy(css = ".right > a:nth-child(4)")
    private Link logoutMenuItem;


    public void gotoProfile() {
        organizationManagementDropdownMenu.click();
        profileMenuItem.click();
    }

    public void gotoUsers() {
        organizationManagementDropdownMenu.click();
        usersMenuItem.click();
    }

    public void gotoManageAppointments() {
        organizationManagementDropdownMenu.click();
        manageAppointmentsMenuItem.click();
    }

    public void gotoDocumentsArchive() {
        organizationManagementDropdownMenu.click();
        documentsArchiveMenuItem.click();
    }

    public void gotoLCGCodes() {
        docsDropdownMenu.click();
        LCGCodesMenuItem.click();
    }

    public void gotoRoutePassport() {
        docsDropdownMenu.click();
        routePassportMenuItem.click();
    }

    public void gotoTicketTypes() {
        docsDropdownMenu.click();
        ticketTypesMenuItem.click();
    }

    public void gotoLoyaltySystems() {
        docsDropdownMenu.click();
        loyaltySystemsMenuItem.click();
    }

    public void gotoSocialRegister() {
        docsDropdownMenu.click();
        socialRegisterMenuItem.click();
    }

    public void gotoDocumentsApproval() {
        documentsApprovalMenuItem.click();
    }

    public void gotoNotification() {
        notificationMenuItem.click();
    }

    public void gotoTask() {
        taskMenuItem.click();
    }

    public void logout() {
        logoutMenuItem.click();
    }
}
