import React, { useEffect, useState } from 'react'
import { Icon, Menu, Table } from 'semantic-ui-react'
import BrandService from '../layouts/BrandServices';

export default function BrandList() {

  const [brands, setBrands] = useState([]);

  useEffect(() => {

    let brandService=new BrandService()
  
    brandService.getBrands().then(result=>setBrands(result.data))
  
  })
  
  return (
    <div>
      <Table celled>
        <Table.Header>
          <Table.Row>
            <Table.HeaderCell>Name</Table.HeaderCell>
            <Table.HeaderCell>Models</Table.HeaderCell>
          </Table.Row>
        </Table.Header>
        <Table.Body>
          {brands.map((brand) => (
              <Table.Row key={4}>

              <Table.Cell>{brand.name}</Table.Cell>
              <Table.Cell>{brand.brandName}</Table.Cell>
            </Table.Row>
            ))}
        </Table.Body>

        <Table.Footer>
          <Table.Row>
            <Table.HeaderCell colSpan='3'>
              <Menu floated='right' pagination>
                <Menu.Item as='a' icon>
                  <Icon name='chevron left' />
                </Menu.Item>
                <Menu.Item as='a'>1</Menu.Item>
                <Menu.Item as='a'>2</Menu.Item>
                <Menu.Item as='a'>3</Menu.Item>
                <Menu.Item as='a'>4</Menu.Item>
                <Menu.Item as='a' icon>
                  <Icon name='chevron right' />
                </Menu.Item>
              </Menu>
            </Table.HeaderCell>
          </Table.Row>
        </Table.Footer>
      </Table>
    </div>
  )
}
