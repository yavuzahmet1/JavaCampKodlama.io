import React from 'react'
import ProductList from '../pages/ProductList'
import Category from './Category'
//import Navi from './Navi'
//import { Button, Icon, Label } from 'semantic-ui-react'
import { Grid } from 'semantic-ui-react'

export default function Dashboard() {
    return (
        <div>
            <Grid columns={2} divided>
                <Grid.Row>
                    <Grid.Column width={4}>
                        <Category />
                    </Grid.Column>

                    <Grid.Column width={12}>
                        <ProductList />
                    </Grid.Column>
                </Grid.Row>
            </Grid>
        </div >
    )
}
 /*<Button as='div' labelPosition='right'>
         <Button color='red'>
             <Icon name='heart' />
             Like
         </Button>
         <Label as='a' basic color='red' pointing='left'>
             2,048
         </Label>
     </Button>
     <Button as='div' labelPosition='right'>
         <Button basic color='blue'>
             <Icon name='fork' />
             Fork
         </Button>
         <Label as='a' basic color='blue' pointing='left'>
             2,048
         </Label>
     </Button>*/