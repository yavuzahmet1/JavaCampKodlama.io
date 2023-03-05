import axios from "axios";
export default class BrandService {
    getBrands() {
        
        return axios.get('http://localhost:8082/api/models');

    }
}