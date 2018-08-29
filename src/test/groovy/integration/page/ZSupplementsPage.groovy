package integration.pages

import geb.Page

class ZSupplementsPage extends Page {
    static url = 'http://localhost:7000/supplements'
    static at = { title == "PetClinic :: a Spring Framework demonstration" }
    static content = {

    }
}
